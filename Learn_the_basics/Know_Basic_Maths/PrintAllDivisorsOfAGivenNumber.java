import java.util.*;

public class PrintAllDivisorsOfAGivenNumber {
    public static void main(String[] args) {
        
        PrintAllDivisorsOfAGivenNumber pd = new PrintAllDivisorsOfAGivenNumber();
        int n = 36;
        List<Integer> result = pd.getDivisors(n);
        System.out.print("Divisors of " + n + ": ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Function to find all divisors
    public List<Integer> getDivisors(int N) {
        // Create list to store divisors
        List<Integer> res = new ArrayList<>();

        // Loop from 1 to N
        for (int i = 1; i <= N; i++) {
            // Check if i is a divisor of N
            if (N % i == 0) {
                // Add i to the result
                res.add(i);
            }
        }
        // Return the list of divisors
        return res;
    }

}
