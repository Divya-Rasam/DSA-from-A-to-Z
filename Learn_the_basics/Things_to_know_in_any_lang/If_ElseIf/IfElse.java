package Learn_the_basics.Things_to_know_in_any_lang.If_ElseIf;

// Import Scanner class to take user input
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  // Read age from user

        // Check if the user is 18 or older
        if (age >= 18) {  
            // If age is 18 or more, they are considered an adult
            System.out.println("You are an adult.");
        } else {
            // Otherwise, they are not an adult
            System.out.println("You are not an adult.");
        }

        // Close the Scanner object to avoid resource leaks
        scanner.close();
        
    }
}
