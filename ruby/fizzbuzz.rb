class FizzBuzz
    def fizz?(number)
        number % 3 == 0
    end

    def buzz?(number)
        number % 5 == 0
    end

    def take(number)
        if fizz?(number) and buzz?(number)
            "fizzbuzz"
        elsif fizz?(number)
            "fizz"
        elsif buzz?(number)
            "buzz"
        else
            number
        end
    end
end
