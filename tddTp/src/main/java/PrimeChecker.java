public class PrimeChecker {

    public boolean isPrime(int number) {
        if(number <=1){
            return false;
        }
        if(number == 2 || number == 3 ) {
            return true;
        }
        if( number % 2 == 0 ) {
            return false;
        }
        for(int i =5; i <=Math.sqrt(number); i+=6){
            if (number % i == 0 || number % (i+2) == 0){
                return false
            }
        }
        return true;
    }
}
