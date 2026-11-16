public class FizzBuzzCheckerTest {
    private final FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();

    @Test
    public void oneShouldBeOne{
        assertEqual(isFizzBuz(1), 1)
    }
}
