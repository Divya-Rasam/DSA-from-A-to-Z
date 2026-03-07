public class InvertedNumberedRightPyramid {
    public static void main(String[] args) {
        // Create object of Solution class
        SolutionINRP sc = new SolutionINRP();

        // Define size of pattern
        int N = 5;

        // Call pattern function
        sc.pattern6(N);
    }
}


class SolutionINRP {
    public void pattern6(int N) {
        // Outer loop for rows
        for (int i = 0; i < N; i++) {
            // Inner loop for columns
            // Prints numbers from 1 up to (N - i)
            for (int j = N; j > i; j--) {
                System.out.print((N - j + 1) + " ");
            }

// for (int j = 1; j <= N - i; j++) {
//     System.out.print(j + " ");
// }

            // Move to next line
            System.out.println();
        }
    }
}