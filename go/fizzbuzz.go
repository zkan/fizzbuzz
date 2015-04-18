package fizzbuzz


func FizzBuzz(number int) string {
    var result string

    if number % 3 == 0 && number % 5 == 0 {
        result = "fizzbuzz"
    } else if number % 3 == 0 {
        result = "fizz"
    } else if number % 5 == 0 {
        result = "buzz"
    }

    return result
}
