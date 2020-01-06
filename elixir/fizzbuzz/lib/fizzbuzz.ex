defmodule Fizzbuzz do
  def say(number) do
    if rem(number, 3) == 0 do
        :Fizz
    end
  end
end
