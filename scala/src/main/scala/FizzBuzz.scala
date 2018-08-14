package fizzbuzz

class FizzBuzz {
  def say(number: Int): Either[String, Unit] = {
    if(number == 3) {
      Left("Fizz")
    } else {
      Right(None)
    }
  }
}
