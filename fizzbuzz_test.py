import unittest


class FizzBuzzTest(unittest.TestCase):
    def test_input_number_should_return_same_number(self):
        fizzbuzz = FizzBuzz()
        result = fizzbuzz.take(1)
        self.assertEqual(result, 1)

        result = fizzbuzz.take(2)
        self.assertEqual(result, 2)


class FizzBuzz:
    def take(self, number):
        return number


if __name__ == '__main__':
    unittest.main()
