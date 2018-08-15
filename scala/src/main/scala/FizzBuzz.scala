object FizzBuzz {
  def say(number: Int) = {
    (number % 3, number % 5) match {
      case (0, 0) => "FizzBuzz"
      case (0, _) => "Fizz"
      case (_, 0) => "Buzz"
      case _ => number
    }
  }
}
