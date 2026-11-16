import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FizzBuzzCheckerTest {
    private final FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();

    @Test
    public void oneShouldBeOne(){
        assertEquals(fizzBuzzChecker.isFizzBuzz(1), "1");
    }

    @Test
    public void twoShouldBeTwo(){
        assertEquals(fizzBuzzChecker.isFizzBuzz(2), "2");
    }

    @Test
    public void threeToFizz(){
        assertEquals(fizzBuzzChecker.isFizzBuzz(3), "Fizz");
        assertNotEquals(fizzBuzzChecker.isFizzBuzz(3), "fizz");
    }

    @Test
    public void FiveToBuzz(){
        assertEquals(fizzBuzzChecker.isFizzBuzz(5), "buzz");
        assertNotEquals(fizzBuzzChecker.isFizzBuzz(5), "Buzz");
    }

    @Test
    public void FiveToBuzz(){
        assertEquals(fizzBuzzChecker.isFizzBuzz(5), "buzz");
        assertNotEquals(fizzBuzzChecker.isFizzBuzz(5), "Buzz");
    }
}
