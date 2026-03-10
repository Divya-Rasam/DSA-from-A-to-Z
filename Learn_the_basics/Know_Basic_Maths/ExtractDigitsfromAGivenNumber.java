import java.util.ArrayList;
import java.util.Collections;

public class ExtractDigitsfromAGivenNumber {
    public static void main(String[] args) {
        
        int N = 7789;
        System.out.println("N: " + N);
        
        ArrayList<Integer> digits = extractDigits(N);
        System.out.print("Extracted Digits: ");
        for (int num : digits) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Function to extract individual digits of a number and store them in an ArrayList
    static ArrayList<Integer> extractDigits(int N) {
        // Initialize an empty ArrayList to store the digits
        ArrayList<Integer> ans = new ArrayList<>();
        
        // Loop to extract digits until N becomes 0
        while(N > 0){
            // Extract the last digit of N
            int lastDigit = N % 10;  
            // Store the last digit in the ArrayList
            ans.add(lastDigit); 
            // Remove the last digit from N
            N = N / 10; 
        }
        
        // Reverse the ArrayList to get digits in the correct order
        Collections.reverse(ans);  
        
        // Return the ArrayList containing individual digits
        return ans; 
    }
}
