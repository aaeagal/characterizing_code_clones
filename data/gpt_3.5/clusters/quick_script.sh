#!/bin/bash

# get all the names of the directories in the clusters directory and store them in an array
directories=($(ls -d */))

# for each directory
for directory in "${directories[@]}"
do
    cd $directory
    # rename the folder 0.1 to 0.10 
    if [ -d "0.1" ]; then
        mv 0.1 0.10
    fi
    if [ -d "0.2" ]; then
        mv 0.2 0.20
    fi
    if [ -d "0.3" ]; then
        mv 0.3 0.30
    fi
    cd ..
done