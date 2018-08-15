package fizzbuzz

object FizzBuzz {
  def say(number: Int): Either[String, Unit] = {
    if(number % 3 == 0) {
      Left("Fizz")
    } else {
      Right(None)
    }
  }
}
