package Learn_the_basics.Things_to_know_in_any_lang.If_ElseIf;

public class IfElseIf {
    public static void main(String[] args) {
        
        // Declare and initialize marks variable
        int marks = 54;

        // Check grade conditions using if-else ladder
        if (marks < 25) {
            System.out.println("Grade: F");  // Less than 25 is Grade F
        } else if (marks >= 25 && marks <= 44) {
            System.out.println("Grade: E");  // Between 25 and 44 is Grade E
        } else if (marks >= 45 && marks <= 49) {
            System.out.println("Grade: D");  // Between 45 and 49 is Grade D
        } else if (marks >= 50 && marks <= 59) {
            System.out.println("Grade: C");  // Between 50 and 59 is Grade C
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Grade: B");  // Between 60 and 69 is Grade B
        } else if (marks >= 70) {
            System.out.println("Grade: A");  // 70 and above is Grade A
        } else {
            System.out.println("Invalid marks entered."); // Handles invalid inputs
        }
        
    }
    
}
