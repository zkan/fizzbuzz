import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void testGetOneShouldReturnOne() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String actual = fizzbuzz.get(1);
        Assertions.assertEquals("1", actual);
    }

    @Test
    void testGetTwoShouldReturnTwo() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String actual = fizzbuzz.get(2);
        Assertions.assertEquals("2", actual);
    }

    @Test
    void testGetThreeShouldReturnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.get(3);
        Assertions.assertEquals("Fizz", actual);
    }
}