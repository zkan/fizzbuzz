import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @Test
    void testGetFifteenShouldReturnFizzBuzz() {
        String actual = this.fizzbuzz.get(15);
        Assertions.assertEquals("FizzBuzz", actual);
    }

    @Test
    void testGetThirtyShouldReturnFizzBuzz() {
        String actual = this.fizzbuzz.get(30);
        Assertions.assertEquals("FizzBuzz", actual);
    }

    @ParameterizedTest
    @CsvSource({
        "1, 1",
        "3, Fizz",
        "5, Buzz",
    })
    void fizzBuzzShouldGetExpectedResults(int input, String expected) {
        String actual = this.fizzbuzz.get(input);
        Assertions.assertEquals(expected, actual);
    }
}