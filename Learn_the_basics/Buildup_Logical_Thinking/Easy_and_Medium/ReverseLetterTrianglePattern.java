public class ReverseLetterTrianglePattern {
    public static void main(String[] args) {
        
        int n = 5;
        ReverseLetterTrianglePattern rltp = new ReverseLetterTrianglePattern();
        rltp.pattern15(n);


    }

    // Function to print the pattern of alphabets in a decreasing order
    public void pattern15(int N) {
        // Outer loop for the number of rows
        for (int i = 0; i < N; i++) {
            
            // Inner loop to print alphabets from A to A + (N-i-1)
            for (char ch = 'A'; ch <= 'A' + (N - i - 1); ch++) {
                System.out.print(ch + " ");  // Print the current character followed by a space
            }

            // Move to the next line after printing the current row
            System.out.println();
        }
    }
}
