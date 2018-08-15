package fizzbuzz

import org.scalatest.{FunSuite, Matchers}

class FizzBuzzSuite extends FunSuite with Matchers {
  test("Input 3 should get Fizz") {
    FizzBuzz.say(3) shouldBe Left("Fizz")
  }

  test("Input 6 should get Fizz") {
    FizzBuzz.say(6) shouldBe Left("Fizz")
  }
}
