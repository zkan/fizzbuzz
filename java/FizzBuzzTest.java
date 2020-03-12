import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void returnsFizzIfGivenThree() {
      String result = this.fizzBuzz.getResult(3);
      assertEquals("Fizz", result);
    }

    @Test
    public void returnsFizzIfGivenSix() {
      String result = this.fizzBuzz.getResult(6);
      assertEquals("Fizz", result);
    }
}
