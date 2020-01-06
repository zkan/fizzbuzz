defmodule Fizzbuzz do
  def say(number) do
    cond do
        rem(number, 3) == 0 and rem(number, 5) == 0 ->
            :FizzBuzz
        rem(number, 3) == 0 ->
            :Fizz
        rem(number, 5) == 0 ->
            :Buzz
    end
  end
end
