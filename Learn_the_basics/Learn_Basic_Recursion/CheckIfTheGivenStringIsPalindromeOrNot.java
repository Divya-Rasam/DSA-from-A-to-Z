public class CheckIfTheGivenStringIsPalindromeOrNot {
    public static void main(String[] args) {
        

        String str =  "TAKE U FORWARD";
        isPalindrome(str);




    }


    public static void isPalindrome(String str) {

                String reverse = "";

        for (int i = str.length()-1; i >= 0 ;i--) {
            reverse = reverse + str.charAt(i);
        }

        if ( reverse.equals(str)) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }

    }
}
