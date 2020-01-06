defmodule FizzbuzzTest do
  use ExUnit.Case
  doctest Fizzbuzz

  test "takes 3 then returns Fizz" do
    assert Fizzbuzz.say(3) == :Fizz
  end

  test "takes 6 then returns Fizz" do
    assert Fizzbuzz.say(6) == :Fizz
  end
end
