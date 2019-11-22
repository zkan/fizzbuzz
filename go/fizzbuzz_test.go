package fizzbuzz

import "testing"

func TestFizzBuzz(t *testing.T) {
	var tests = []struct {
		number int
		result string
	}{
		{number: 3, result: "fizz"},
		{number: 6, result: "fizz"},
		{number: 5, result: "buzz"},
		{number: 10, result: "buzz"},
		{number: 15, result: "fizzbuzz"},
		{number: 30, result: "fizzbuzz"},
		{number: 1, result: "1"},
		{number: 7, result: "7"},
	}

	for _, each := range tests {
		var result string = FizzBuzz(each.number)

		if result != each.result {
			t.Errorf("expect to get %d but got %s", each.result, result)
		}
	}
}
