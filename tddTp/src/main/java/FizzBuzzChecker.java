public class FizzBuzzChecker {

    public String isFizzBuzz(int number) {
        if (isDivisibleByFifteen(number)) {
            return "FizzBuzz";
        }

        if (isDivisibleByThree(number)) {
            return "Fizz";
        }

        if (isDivisibleByFive(number)) {
            return "Buzz";
        }

        return String.valueOf(number);
    }

    private boolean isDivisibleByFifteen(int number) {
        return number % 15 == 0;
    }

    private boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }

    private boolean isDivisibleByFive(int number) {
        return number % 5 == 0;
    }
}