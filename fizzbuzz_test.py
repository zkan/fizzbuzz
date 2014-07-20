import unittest


class FizzBuzzTest(unittest.TestCase):
    def setUp(self):
        self.fizzbuzz = FizzBuzz()

    def test_input_number_should_return_same_number(self):
        result = self.fizzbuzz.take(1)
        self.assertEqual(result, 1)

        result = self.fizzbuzz.take(2)
        self.assertEqual(result, 2)

    def test_input_number_divisible_by_3_should_return_fizz(self):
        result = self.fizzbuzz.take(3)
        self.assertEqual(result, 'fizz')

        result = self.fizzbuzz.take(6)
        self.assertEqual(result, 'fizz')

    def test_input_number_divisible_by_5_should_return_buzz(self):
        result = self.fizzbuzz.take(5)
        self.assertEqual(result, 'buzz')

        result = self.fizzbuzz.take(10)
        self.assertEqual(result, 'buzz')

    def test_input_number_divisible_by_3_and_5_should_return_fizzbuzz(self):
        result = self.fizzbuzz.take(15)
        self.assertEqual(result, 'fizzbuzz')

        result = self.fizzbuzz.take(30)
        self.assertEqual(result, 'fizzbuzz')


class FizzBuzz:
    def take(self, number):
        if number % 3 == 0 and number % 5 == 0:
            return 'fizzbuzz'
        elif number % 3 == 0:
            return 'fizz'
        elif number % 5 == 0:
            return 'buzz'

        return number


if __name__ == '__main__':
    unittest.main()
