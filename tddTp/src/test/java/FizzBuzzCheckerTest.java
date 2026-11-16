import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FizzBuzzCheckerTest {
    private final FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();

    @Test
    public void oneShouldBeOne(){
        assertEquals("1", fizzBuzzChecker.isFizzBuzz(1));
    }

    @Test
    public void twoShouldBeTwo(){
        assertEquals("2", fizzBuzzChecker.isFizzBuzz(2));
    }

    @Test
    public void threeToFizz(){
        assertEquals("Fizz", fizzBuzzChecker.isFizzBuzz(3));
        assertNotEquals("fizz", fizzBuzzChecker.isFizzBuzz(3));
    }

    @Test
    public void FiveToBuzz(){
        assertEquals("Buzz", fizzBuzzChecker.isFizzBuzz(5));
        assertNotEquals("buzz", fizzBuzzChecker.isFizzBuzz(5));
    }
    @Test
    public void QuinzeToFizzBuzz(){
        assertEquals( "FizzBuzz", fizzBuzzChecker.isFizzBuzz(15));
        assertNotEquals("Buzz",fizzBuzzChecker.isFizzBuzz(15));
        assertNotEquals("Fizzbuzz",fizzBuzzChecker.isFizzBuzz(15));
    }
}
