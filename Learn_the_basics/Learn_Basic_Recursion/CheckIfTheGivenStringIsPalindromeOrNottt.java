public class CheckIfTheGivenStringIsPalindromeOrNottt {
    public static void main(String[] args) {
        
        String str = "ABCDBA";
        IsPalindrome1 pal = new IsPalindrome1();
        System.out.println(pal.palindrome(0, str));

    }
}


class IsPalindrome1{
    public boolean palindrome(int i, String str) {

        if (i >= str.length() / 2) return true;

        if (str.charAt(i) != str.charAt(str.length() -i -1)) return false;

        return palindrome(i + 1, str);
    }
}