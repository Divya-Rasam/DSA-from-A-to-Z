public class StarPyramid {
    public static void main(String[] args) {
        SolutionSP sol = new SolutionSP();
        sol.pattern7(4);
    }
}


class SolutionSP {
    // Function to print Pattern 7
    public void pattern7(int N) {
        // Outer loop for rows
        for (int i = 0; i < N; i++) {

            // Print leading spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // Print trailing spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Move to next row
            System.out.println();
        }
    }
}