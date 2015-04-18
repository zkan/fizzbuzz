package fizzbuzz


func FizzBuzz(number int) string {
    var result string

    if number % 3 == 0 {
        result = "fizz"
    }

    return result
}
