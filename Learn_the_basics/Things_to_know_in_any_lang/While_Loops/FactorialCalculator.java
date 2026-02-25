package Learn_the_basics.Things_to_know_in_any_lang.While_Loops;

public class FactorialCalculator {
    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;

        while (n > 0) {
            factorial *= n;  //Keep finding factorial with n and decrement n 
            n--;
        }

        System.out.println("Factorial of 5 is: " + factorial);  //Print the factorial
    }
}