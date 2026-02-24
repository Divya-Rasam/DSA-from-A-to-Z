package Learn_the_basics.Things_to_know_in_any_lang.Cpp_Basics;

// To determine the length of a string, we can use the size or length function. These functions return the number of characters in the string. 
// For example, if we have s as our string, you can find its length like this:

public class StringLength {
    public static void main(String[] args) {
        
        Solution sol = new Solution();

        String s = "Hello World";
        System.out.println(sol.findLength(s));

    }
}

class Solution {

    public int findLength(String s) {
        return s.length();
    }
}