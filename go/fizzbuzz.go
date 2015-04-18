package fizzbuzz

import "strconv"


func FizzBuzz(number int) string {
    if isFizz(number) && isBuzz(number) {
        return "fizzbuzz"
    } else if isFizz(number) {
        return "fizz"
    } else if isBuzz(number) {
        return "buzz"
    } else {
        return strconv.Itoa(number)
    }
}

func isFizz(number int) bool {
    return number % 3 == 0
}

func isBuzz(number int) bool {
    return number % 5 == 0
}
