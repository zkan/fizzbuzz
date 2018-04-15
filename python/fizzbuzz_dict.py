import unittest


def fizzbuzz(number: int) -> str:
    mapping = {
        True: number,
        number % 3 == 0: 'Fizz',
        number % 5 == 0: 'Buzz',
        number % 3 == 0 and number % 5 == 0: 'FizzBuzz',
    }

    return mapping[True]


class FizzBuzzTest(unittest.TestCase):
    def test_input_3_should_return_fizz(self):
        result = fizzbuzz(3)
        self.assertEqual(result, 'Fizz')

    def test_input_6_should_return_fizz(self):
        result = fizzbuzz(6)
        self.assertEqual(result, 'Fizz')

    def test_input_5_should_return_buzz(self):
        result = fizzbuzz(5)
        self.assertEqual(result, 'Buzz')

    def test_input_10_should_return_buzz(self):
        result = fizzbuzz(10)
        self.assertEqual(result, 'Buzz')

    def test_input_15_should_return_fizzbuzz(self):
        result = fizzbuzz(15)
        self.assertEqual(result, 'FizzBuzz')

    def test_input_30_should_return_fizzbuzz(self):
        result = fizzbuzz(30)
        self.assertEqual(result, 'FizzBuzz')

    def test_input_2_should_return_2(self):
        result = fizzbuzz(2)
        self.assertEqual(result, 2)

    def test_input_7_should_return_7(self):
        result = fizzbuzz(7)
        self.assertEqual(result, 7)


unittest.main()
