public class PrimeChecker {

    public boolean isPrime(int number) {
        if(number == 2 || number == 3) {
            return true;
        }
        if( number % 2 == 1 ) {
            return false;
        }
        return false;
    }
}
