public class PrintFibonacciSeriesUpToNthTermm {
    public static void main(String[] args) {
        
        int n = 5;

        if ( n == 0) System.out.println(0);
        else {
            int secondLast = 0;
            int last = 1;

            System.out.println("The Fibonacci Series up to " + n + "th term: ");
            System.out.print(secondLast + " " + last + " ");

            int curr;
            for (int i = 2; i <= n; i++) {
                curr = last + secondLast;
                secondLast = last;
                last = curr;
                System.out.print(curr + " ");
            }
        }



    }
}
