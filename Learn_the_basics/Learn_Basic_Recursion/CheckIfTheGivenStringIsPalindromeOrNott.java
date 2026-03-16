public class CheckIfTheGivenStringIsPalindromeOrNott {
    public static void main(String[] args) {
        
        IsPalindrome pal = new IsPalindrome();
        String str = "ABCDCBA";

        boolean ans = pal.isPalindrome(str);

        if (ans) System.out.println("Palindrome");
        else System.out.println("Not palindrome");

    }
}


class IsPalindrome {
    public boolean isPalindrome(String str) {

        int left = 0, right = str.length() - 1;

        while(left < right) {
            if(!Character.isLetterOrDigit(str.charAt(left)))
                left++;
            else if(!Character.isLetterOrDigit(str.charAt(right)))
                right--;
            else if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right)))
                return false;
            else {
                left++;
                right--;
            }
        }
        return true;
        
    }
}