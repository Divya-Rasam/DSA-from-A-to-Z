public class CheckIfANumberIsPrimeOrNott {
    public static void main(String[] args) {
        
        int n = 7;
        System.out.println(isPrime(n));

    }

    public static boolean isPrime(int n) {

        int count = 0; 

        for ( int i = 1; i <= Math.sqrt(n); i++) {
            if ( n % i == 0) {
                count++;

                if( n / i != i) {
                    count++;
                }
            }
        }

        return count == 2;


    }
}
