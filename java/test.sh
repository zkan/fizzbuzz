#!/bin/bash

javac -cp .:junit-4.13.jar FizzBuzzTest.java
java -cp .:junit-4.13.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore FizzBuzzTest
