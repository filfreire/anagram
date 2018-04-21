# anagram

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Build Status](https://travis-ci.org/filfreire/anagram.svg?branch=master)](https://travis-ci.org/filfreire/anagram)

Two string checker for anagrams

## Details

Two strings are anagrams if they are written using the same exact letters. For example, ‘Eleven plus two’ and ‘Twelve plus one’ are meaningful anagrams of each other.

## Requirements

- Maven 3 (using mvn 3.5.2 version)
- Java 8  (using 1.8.0\_131)

## How to build

In terminal run command:
```
mvn clean install
```

## How to run

After building, run:

```
java -jar target/anagram-1.0-SNAPSHOT-jar-with-dependencies.jar <first_sentence> <second_sentence>
```

**Examples**:
```
java -jar target/anagram-1.0-SNAPSHOT-jar-with-dependencies.jar aaaa aaaa

Exact anagram: TRUE
Meaningful anagram: TRUE
```


```
java -jar target/anagram-1.0-SNAPSHOT-jar-with-dependencies.jar "Eleven plus two" "Twelve plus one"

Exact anagram: FALSE
Meaningful anagram: TRUE
```

## Notes:
- Using Cactoos library ([link](https://github.com/yegor256/cactoos));
- Using Qulice for "hardcore" static analysis ([link](http://www.qulice.com/));
