#!/usr/bin/env bash

tmp_file="___tmp.java"

../lib/add_javadoc.pl ./cases/ > $tmp_file

diff $tmp_file ./result/Test.java

if [ $? -ne 0 ]; then
    rm $tmp_file
    echo "Error: diff exist"
    echo
    exit 1
else
    echo "All tests passed!"
fi

rm $tmp_file

# TODO try to compile/indent result/Test.java?

# TODO Run again script on generated file, result must be iso (test script convergence)