public class AlphaRampPattern {
    public static void main(String[] args) {
        
        int n = 5;
        AlphaRampPattern arp = new AlphaRampPattern();
        arp.pattern16(n);


    }

    // Function to print the pattern where each letter is repeated in the row
    public void pattern16(int N) {
        // Outer loop for the number of rows
        for (int i = 0; i < N; i++) {
            
            // Define the character for each row based on row index
            char ch = (char) ('A' + i);
            
            // Inner loop to print the character for i times in the row
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");  // Print the character followed by a space
            }

            // Move to the next line after printing the current row
            System.out.println();
        }
    }
}
