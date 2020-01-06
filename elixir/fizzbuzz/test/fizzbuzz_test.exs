defmodule FizzBuzzTest do
  use ExUnit.Case
  doctest FizzBuzz

  test "takes 3 then returns Fizz" do
    assert FizzBuzz.say(3) == :Fizz
  end

  test "takes 6 then returns Fizz" do
    assert FizzBuzz.say(6) == :Fizz
  end

  test "takes 5 then returns Buzz" do
    assert FizzBuzz.say(5) == :Buzz
  end

  test "takes 10 then returns Buzz" do
    assert FizzBuzz.say(10) == :Buzz
  end

  test "takes 15 then returns FizzBuzz" do
    assert FizzBuzz.say(15) == :FizzBuzz
  end

  test "takes 30 then returns FizzBuzz" do
    assert FizzBuzz.say(30) == :FizzBuzz
  end

  test "takes 2 then returns 2" do
    assert FizzBuzz.say(2) == 2
  end

  test "takes 7 then returns 7" do
    assert FizzBuzz.say(7) == 7
  end

  test "takes 0 then returns 0" do
    assert FizzBuzz.say(0) == 0
  end
end
