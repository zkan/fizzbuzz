import unittest


class Rule(object):
    def check(self, number):
        pass

    def say(self, number):
        pass


class FizzRule(Rule):
    def check(self, number):
        return number % 3 == 0

    def say(self, number):
        return 'fizz'


class BuzzRule(Rule):
    def check(self, number):
        return number % 5 == 0

    def say(self, number):
        return 'buzz'


class FizzBuzzRule(Rule):
    def check(self, number):
        return number % 3 == 0 and number % 5 == 0

    def say(self, number):
        return 'fizzbuzz'


class NumberRule(Rule):
    def check(self, number):
        return number % 3 != 0 and number % 5 != 0

    def say(self, number):
        return number


class FizzBuzzFactory():
    def __init__(self, rules):
        self.rules = rules

    def take(self, number):
        for each in self.rules:
            if each.check(number):
                return each.say(number)


class FizzBuzzTest(unittest.TestCase):
    def setUp(self):
        self.fizzbuzz = FizzBuzzFactory(
            [
                FizzBuzzRule(),
                FizzRule(),
                BuzzRule(),
                NumberRule()
            ]
        )

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


if __name__ == '__main__':
    unittest.main()
