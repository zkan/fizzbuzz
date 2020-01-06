defmodule FizzbuzzTest do
  use ExUnit.Case
  doctest Fizzbuzz

  test "takes 3 then returns Fizz" do
    assert Fizzbuzz.say(3) == :Fizz
  end

  test "takes 6 then returns Fizz" do
    assert Fizzbuzz.say(6) == :Fizz
  end

  test "takes 5 then returns Buzz" do
    assert Fizzbuzz.say(5) == :Buzz
  end

  test "takes 10 then returns Buzz" do
    assert Fizzbuzz.say(10) == :Buzz
  end

  test "takes 15 then returns FizzBuzz" do
    assert Fizzbuzz.say(15) == :FizzBuzz
  end

  test "takes 30 then returns FizzBuzz" do
    assert Fizzbuzz.say(30) == :FizzBuzz
  end
end
