import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzCheckerTest {
    private final FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();

    @Test
    public void oneShouldBeOne(){
        assertEquals(fizzBuzzChecker.isFizzBuzz(1), "1");
    }
}
