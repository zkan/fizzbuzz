import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz fizzbuzz;

    @BeforeEach
    void setUp() {
        this.fizzbuzz = new FizzBuzz();
    }

    @Test
    void testGetOneShouldReturnOne() {
        String actual = this.fizzbuzz.get(1);
        Assertions.assertEquals("1", actual);
    }

    @Test
    void testGetTwoShouldReturnTwo() {
        String actual = this.fizzbuzz.get(2);
        Assertions.assertEquals("2", actual);
    }

    @Test
    void testGetThreeShouldReturnFizz() {
        String actual = this.fizzbuzz.get(3);
        Assertions.assertEquals("Fizz", actual);
    }

    @Test
    void testGetSixShouldReturnFizz() {
        String actual = this.fizzbuzz.get(6);
        Assertions.assertEquals("Fizz", actual);
    }

    @Test
    void testGetFiveShouldReturnBuzz() {
        String actual = this.fizzbuzz.get(5);
        Assertions.assertEquals("Buzz", actual);
    }

    @Test
    void testGetTenShouldReturnBuzz() {
        String actual = this.fizzbuzz.get(10);
        Assertions.assertEquals("Buzz", actual);
    }

}