import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTest {
    private final PrimeChecker primeChecker = new PrimeChecker();

    @Test
    public void test0IsNotPrime() {
        assertFalse(primeChecker.isPrime(0));
    }

    @Test
    public void test1IsNotPrime() {
        assertFalse(primeChecker.isPrime(1));
    }

    @Test
    public void test2IsPrime() {
        assertTrue(primeChecker.isPrime(2));
    }

    @Test
    public void test3IsPrime() {
        assertTrue(primeChecker.isPrime(3));
    }

    @Test
    public void test4IsNotPrime() {
        assertFalse(primeChecker.isPrime(4));
    }

    @Test
    public void test5IsPrime() {
        assertTrue(primeChecker.isPrime(5));
    }
}
