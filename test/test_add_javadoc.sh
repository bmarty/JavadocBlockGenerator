#!/usr/bin/env bash

tmp_file="___tmp.java"
tmp_file2="___tmp2.java"

../lib/add_javadoc.pl ./cases/ > $tmp_file

diff $tmp_file ./result/Test.java

result1=$?

rm $tmp_file

if [ $result1 -ne 0 ]; then
    echo "Error: diff exist"
    echo
fi


# TODO try to compile/indent result/Test.java?

# Run again script on generated file, result must be iso (test the script convergence)

../lib/add_javadoc.pl ./result/ > $tmp_file


cp ./result/Test.java $tmp_file2
echo "// Done! No file modified." >> $tmp_file2

diff $tmp_file $tmp_file2

result2=$?

rm $tmp_file
rm $tmp_file2

if [ $result2 -ne 0 ]; then
    echo "Error: result is not stable."
    echo
fi

if [ $result1 -eq 0 ] && [ $result2 -eq 0 ]; then
    echo "All tests passed!"
else
    exit 1
fi
