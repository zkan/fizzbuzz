import org.scalatest.{FunSuite, Matchers}

class FizzBuzzSuite extends FunSuite with Matchers {
  test("Input 3 should get Fizz") {
    FizzBuzz.say(3) shouldBe "Fizz"
  }

  test("Input 6 should get Fizz") {
    FizzBuzz.say(6) shouldBe "Fizz"
  }

  test("Input 5 should get Buzz") {
    FizzBuzz.say(5) shouldBe "Buzz"
  }

  test("Input 10 should get Buzz") {
    FizzBuzz.say(10) shouldBe "Buzz"
  }

  test("Input 15 should get FizzBuzz") {
    FizzBuzz.say(15) shouldBe "FizzBuzz"
  }

  test("Input 30 should get FizzBuzz") {
    FizzBuzz.say(30) shouldBe "FizzBuzz"
  }

  test("Input 1 should get 1") {
    FizzBuzz.say(1) shouldBe 1
  }

  test("Input 4 should get 4") {
    FizzBuzz.say(4) shouldBe 4
  }
}
