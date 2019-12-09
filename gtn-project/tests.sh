#!/bin/bash

mvn package -q

inputs=("0 0" "0 10" "" "23 32" "2 3" "3 2" "32 23" "-100 0" "1 132" "3 3" "23 32 3" "e 3" "! @" "-h" "--help")

for i in ${!inputs[*]}; do
    echo "Parameters: " "${inputs[$i]}"
    java -ea -jar target/gtn.jar ${inputs[$i]}
done
