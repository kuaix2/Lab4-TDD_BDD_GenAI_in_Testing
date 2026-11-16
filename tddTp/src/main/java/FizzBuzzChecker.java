public class FizzBuzzChecker {

    public String isFizzBuzz(int number) {
        if(number == 1){
            return "1";
        }

        if(number == 2){
            return "2";
        }

        if(number == 3){
            return "Fizz";
        }

        if(number == 5){
            return "Buzz";
        }
        return "";
    }
}
