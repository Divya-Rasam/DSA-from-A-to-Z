public class FactorialOfANumberIterativeRecursive {
    public static void main(String[] args) {
        
        int x = 5;

        System.out.println(factorialIterative(x));
        System.out.println(factorialRecursive(x));



    }

    public static int factorialIterative(int x) {

        int fact = 1;

        for ( int i = 1; i <= x; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static int factorialRecursive(int x) {

        if (x == 0) return 1;

        return x * factorialRecursive(x-1);
    }
}


// Time Complexity: O(n)

// Space Complexity: O(1)
