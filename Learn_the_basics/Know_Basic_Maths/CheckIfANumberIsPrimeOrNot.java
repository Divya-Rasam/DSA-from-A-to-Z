public class CheckIfANumberIsPrimeOrNot {
    public static void main(String[] args) {
        
        int n = 78;
        CheckIfANumberIsPrimeOrNot por = new CheckIfANumberIsPrimeOrNot();

        boolean PrimeOrNot = por.isPrime(n);

        if (PrimeOrNot) {
            System.out.println("is prime number");
        } else {
            System.out.println("not a prime num");
        }
    }    

    // Function to check if a given number is prime
    public boolean isPrime(int n) {
        int cnt = 0;  // Initialize a counter variable to count the number of factors

        // Loop through numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // If n is divisible by i without any remainder
            if (n % i == 0) {
                cnt++;  // Increment the counter
            }
        }

        // If the number of factors is exactly 2 (1 and the number itself), it's prime
        return cnt == 2;
    }
}
