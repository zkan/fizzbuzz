package fizzbuzz

import org.scalatest.{FunSuite, Matchers}

class FizzBuzzSuite extends FunSuite with Matchers {
  test("Input 3 should get Fizz") {
    (new FizzBuzz).say(3) shouldBe Left("Fizz")
  }
}
