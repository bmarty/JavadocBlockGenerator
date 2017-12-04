#!/usr/bin/perl

use warnings;
use strict;
use File::Find;
use List::Util qw[min max];

my $usage = "Usage: $0 [-write] ROOT_PATH...\n";

my $root = shift or die $usage;

my $writeMode = 0;

if($root eq "-write") {
    $writeMode = 1;
    $root = shift or die $usage;
}

my %defaultComment =
    (
       "Context" => "the Android context",
       "Void" => "ignored parameter",
       "Realm"   => "the realm database instance"
    );

my $countFile = 0;
my $countBlock = 0;

my %parameterTypes = ();

while ($root) {
    find( \&analyseFile, $root );

    $root = shift;
}

# Uncomment to get a list of types for parameters
# print STDERR "$_\n" for sort keys(%parameterTypes);

select STDOUT;

if($countFile == 0) {
    print "// Done! No file modified.\n"
} else {
    print "// Done! $countBlock javadoc block(s) added to $countFile file(s)\n";
}

# Subs

sub toParam {
    my $arg = shift;

    # First letter in lower case
    return lcfirst($arg);
}

sub getPhraseFromName {
    my $name = shift;
    my $nameucfirst = ucfirst($name);

    my @parts = $nameucfirst =~ /[A-Z](?:[A-Z]+|[a-z]*)(?=$|[A-Z])/g;

    my $recombined = join("", @parts);

    if(@parts && $#parts > 0 && $nameucfirst eq $recombined) {
        # Special case for "with"
        my $verb = $parts[0];

        my $res;
        if($verb eq "With") {
            $res = "Configure this object with a"
        } else {
            $res = $verb;
        }

        $res .= " " . lc($parts[$_]) for (1..$#parts);

        return $res;
    }

    return "JBG: Missing documentation for $name";
}

sub analyseFile {
    my $file = $_;

    open my $INPUT, '<', $file or do {
        warn qq|WARNING: Could not open $File::Find::name\n|;
        return;
    };

    my $OUTPUT;

    if($writeMode == 1) {
        open $OUTPUT, '>', "tmp.java" or do {
            warn qq|WARNING: Could not open "tmp.java"\n|;
            return;
        };

        select $OUTPUT;
    }

    my $javadocDetected = 0;
    my $nbOfJavaDocAdded = 0;

    my @params;
    my $block = "";
    my $skip;

    while ( <$INPUT> ) {
        chomp;

        my $line = $_;

        $skip = 0;

        if ($line =~ m!^\s*//!) {
            # Commented out line
        } elsif ($line =~ m!/\*\*!) {
            $javadocDetected = 1;
        } elsif($line =~ m!^\s*@!) {
            # Annotation detected
            $block .= $line . "\n";
            $skip = 1;
        } elsif ($line =~ /^(\s*)public (static )?(final )?(abstract )?(\w+(<[^>]*>)?(\[\])?) (\w+)/) {
            my $indent = $1;
            my $type = $5;
            my $name = $8;
            my $rest = $';

            if($javadocDetected == 0) {
                $nbOfJavaDocAdded++;

                print "$indent/**\n";

                if ($type eq "enum") {
                    # Enums
                    print "$indent * JBG: Documentation for enum $name\n";
                }
                elsif ($type eq "class") {
                    # Classes
                    print "$indent * JBG: Documentation for class $name\n";

                    if($rest && $rest =~ /^<([^>]+)>/) {
                        my $hasParam = 0;

                        # TODO Handle param with ','
                        my @elements = split(/\s*\,\s*/, $1);

                        for (@elements) {
                            my @words = split(/\s+/, $_);

                            my $p = $words[0];

                            if($hasParam == 0) {
                                $hasParam = 1;
                                print "$indent *\n";
                            }

                            print "$indent * \@param <$p>\n";
                        }
                    }
                } elsif ($type eq "interface") {
                    # Interface
                    print "$indent * JBG: Documentation for interface $name\n";
                } elsif ($type ne "void" && $name =~ /get(\w+)/ && $rest eq "() {") {
                    # Getters
                    my $param = &toParam($1);
                    print "$indent * Getter for $param\n";
                    print "$indent *\n";
                    print "$indent * \@return value of $param\n";
                } elsif ($type eq "void" && $name =~ /set(\w+)/ && $rest =~ /^\([^,\)]*\) {$/) {
                    # Setters
                    # Match again to get the correct $1
                    $name =~ /set(\w+)/;
                    my $param = &toParam($1);
                    print "$indent * Setter for $param\n";
                    print "$indent *\n";
                    print "$indent * \@param $param the new value for $param\n";
                } else {
                    my $phrase = &getPhraseFromName($name);
                    print "$indent * $phrase\n";

                    my $hasParam = 0;

                    # Get all the params
                    if($rest && $rest =~ /\(/) {
                        # Method detected, parse the parameters
                        my $paramsList = $rest;

                        # Use while
                        while($paramsList !~ /\)/) {
                            my $line2 = <$INPUT>;
                            chomp($line2);

                            $line .= "\n" . $line2;

                            $paramsList .= $line2 if ($line2);
                        }

                        # Extract the params
                        if($paramsList =~ /^\(([^\)]+)\)/) {
                            my $listWithoutParenthesis = $1;

                            my @elements = split(/\s*\,\s*/, $listWithoutParenthesis);

                            # Compute biggest parameter name length
                            my $biggestParameterLength = 0;

                            for (@elements) {
                                my @words = split(/\s+/, $_);

                                my $parameterName = $words[-1];

                                $biggestParameterLength = max($biggestParameterLength, length($parameterName));
                            }

                            $biggestParameterLength++;

                            # Write parameters
                            for (@elements) {
                                my @words = split(/\s+/, $_);

                                my $parameterName = $words[-1];

                                if($parameterName !~ /[<>]/) {
                                    my $parameterType = $words[-2];

                                    if($hasParam == 0) {
                                        $hasParam = 1;
                                        print "$indent *\n";
                                    }

                                    print "$indent * \@param $parameterName";

                                    if ($parameterType) {
                                        $parameterTypes{$parameterType} = 1;
                                    }

                                    if ($parameterType && $defaultComment{$parameterType}) {
                                        print " " x ($biggestParameterLength - length($parameterName)) . $defaultComment{$parameterType};
                                    }

                                    print "\n";
                                }
                            }
                        }
                    }

                    if($type ne "void" && $rest =~ /\(/) {
                        if($hasParam == 0) {
                            print "$indent *\n";
                        }

                        print "$indent * \@return $type\n";
                    }
                }

                print "$indent */\n";
            }

            $javadocDetected = 0;
        } elsif ($line =~ /^(\s*)public (\w+)\(/) {
            # Constructor
            my $indent = $1;
            my $name = $2;
            my $rest = $';

            if($javadocDetected == 0) {
                $nbOfJavaDocAdded++;

                print "$indent/**\n";

                print "$indent * Constructor for class $name\n";

                my $hasParam = 0;

                # Get all the params
                my $paramsList = $rest;

                # Use while
                while($paramsList !~ /\)/) {
                    my $line2 = <$INPUT>;
                    chomp($line2);

                    $line .= "\n" . $line2;

                    $paramsList .= $line2 if ($line2);
                }

                # Extract the params
                if($paramsList =~ /^([^\)]+)\)/) {
                    my $listWithoutParenthesis = $1;

                    my @elements = split(/\s*\,\s*/, $listWithoutParenthesis);

                    # Compute biggest parameter name length
                    my $biggestParameterLength = 0;

                    for (@elements) {
                        my @words = split(/\s+/, $_);

                        my $parameterName = $words[-1];

                        $biggestParameterLength = max($biggestParameterLength, length($parameterName));
                    }

                    $biggestParameterLength++;

                    # Write parameters
                    for (@elements) {
                        my @words = split(/\s+/, $_);

                        my $parameterName = $words[-1];

                        if($parameterName !~ /[<>]/) {
                            my $parameterType = $words[-2];

                            if($hasParam == 0) {
                                $hasParam = 1;
                                print "$indent *\n";
                            }

                            print "$indent * \@param $parameterName";

                            if ($parameterType && $defaultComment{$parameterType}) {
                                print " " x ($biggestParameterLength - length($parameterName)) . $defaultComment{$parameterType};
                            }

                            print "\n";
                        }
                    }
                }

                print "$indent */\n";
            }

            $javadocDetected = 0;
        } elsif ($line =~ /^\s*$/) {
            # Empty line

            $javadocDetected = 0;
        }

        if($skip == 0) {
            print $block;
            $block = "";
            print $line . "\n";
        }
    }

    if($nbOfJavaDocAdded > 0) {
        $countBlock += $nbOfJavaDocAdded;
        $countFile++;
    }

    close $INPUT;

    if($writeMode == 1) {
        close $OUTPUT;

        rename "tmp.java", $file;
        unlink "tmp.java";
    }
}
