#!/bin/bash
#set -x
ARGS_NUM=2
if [[ ( $# -lt $ARGS_NUM ) ]]; then
  echo "Usage: script.sh PARAM1 PARAM2"
  exit 1
fi

param1=$1
param2=$2

java -jar target/anagram-1.0-SNAPSHOT-jar-with-dependencies.jar "$param1" "$param2"
