public class PrimeChecker {

    private boolean IsInferieurAUn(int number){
        if(number <=1){
            return true;
        }
        return false;
    }

    private boolean IsPair(int number){
        if( number % 2 == 0  || number % 3 == 0 ) {
            return true;
        }
        return false;
    }

    private boolean IsDivisiblePArTrois(int number){
        if( number % 3 == 0 ) {
            return true;
        }
        return false;
    }
    private boolean IsDivisibleByNumber(int number){
        for(int i =5; i <=Math.sqrt(number); i+=6){
            if (number % i == 0 || number % (i+2) == 0){
                return true;
            }
        }
        return false;
    }

    public boolean isPrime(int number) {

        if(number == 2 || number == 3 ) {
            return true;
        }

        if (IsInferieurAUn(number) || IsPair(number) || IsDivisiblePArTrois(number) || IsDivisibleByNumber(number)) {
            return false;
        }
        
        return true;
    }
}
