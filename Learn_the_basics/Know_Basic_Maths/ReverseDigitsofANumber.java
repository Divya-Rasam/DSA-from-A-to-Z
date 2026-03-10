public class ReverseDigitsofANumber {
    public static void main(String[] args) {
        
        int N = 12345;
        ReverseDigitsofANumberSolution rdns = new ReverseDigitsofANumberSolution();
        System.out.println(rdns.reverseNumber(N));


    }
}

class ReverseDigitsofANumberSolution {
    // Function to reverse digits of a number
    public int reverseNumber(int n) {
        // Variable to store reversed number
        int revNum = 0;

        // Loop until all digits are processed
        while (n > 0) {
            // Get the last digit
            int lastDigit = n % 10;

            // Append it to the reversed number
            revNum = revNum * 10 + lastDigit;

            // Remove the last digit from n
            n = n / 10;
        }

        // Return the reversed number
        return revNum;
    }
}
