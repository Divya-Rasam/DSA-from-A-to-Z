public class DiamondStarPattern {
    public static void main(String[] args) {

        int N = 5;
        DiamondStarPatternSolution dsps = new DiamondStarPatternSolution();
        dsps.erectPyramid(N);
        dsps.invertedPyramid(N);

    }
}

class DiamondStarPatternSolution {
    // Function to print the erect (upright) pyramid
    public void erectPyramid(int N) {
        for (int i = 0; i < N; i++) {
            // Print spaces before stars
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // Print spaces after stars
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Function to print the inverted pyramid
    public void invertedPyramid(int N) {
        for (int i = 0; i < N; i++) {
            // Print spaces before stars
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < 2 * N - (2 * i + 1); j++) {
                System.out.print("*");
            }
            // Print spaces after stars
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}