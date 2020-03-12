#!/bin/bash

# JUnit 4
#javac -cp .:junit-4.13.jar FizzBuzzTest.java
#java -cp .:junit-4.13.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore FizzBuzzTest

# JUnit 5
javac -cp .:junit-platform-console-standalone-1.6.0.jar FizzBuzzTest.java
java -jar junit-platform-console-standalone-1.6.0.jar --class-path . --scan-classpath
