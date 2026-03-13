public class HollowRectanglePattern {
    public static void main(String[] args) {
        
        int n = 5;
        pattern21(n);
    }

    // Function to print hollow square pattern
    public static void pattern21(int n) {
        // Outer loop for rows
        for (int i = 0; i < n; i++) {
            // Inner loop for columns
            for (int j = 0; j < n; j++) {
                // Print star if it's a border cell
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
                    System.out.print("*");
                // Print space otherwise
                else
                    System.out.print(" ");
            }
            // Move to next line after each row
            System.out.println();
        }
    }
}
