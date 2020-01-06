defmodule FizzBuzz do
  def say(number) do
    cond do
        number == 0 ->
            number
        rem(number, 3) == 0 and rem(number, 5) == 0 ->
            :FizzBuzz
        rem(number, 3) == 0 ->
            :Fizz
        rem(number, 5) == 0 ->
            :Buzz
        true ->
            number
    end
  end
end
