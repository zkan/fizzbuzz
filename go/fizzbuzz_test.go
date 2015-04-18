package fizzbuzz

import "testing"


func TestFizzBuzz(t *testing.T) {
    var tests = []struct {
        number int
        result string
    } {
        {number: 3, result: "fizz"},
        {number: 6, result: "fizz"},
    }

    for _, each := range tests {
        var result string = FizzBuzz(each.number)

        if result != each.result {
            t.Error("expect to get %d but got %s", each.number, result)
        }
    }
}
