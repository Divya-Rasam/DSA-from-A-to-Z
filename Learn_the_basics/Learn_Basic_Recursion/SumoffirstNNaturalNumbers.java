public class SumoffirstNNaturalNumbers {
    public static void main(String[] args) {
        
        int n = 5;

        
        System.out.println(addNN(n));

    }

    public static int addNN(int N) {
        // Initialize sum to 0
        int sum = 0;

        // Loop from 1 to N
        for (int i = 1; i <= N; i++) {
            // Add current number to sum
            sum += i;
        }

        // Return the computed sum
        return sum;
    }


}
