package Learn_the_basics.Things_to_know_in_any_lang.Cpp_Basics;

// You can access individual characters within a string using square brackets, just like an array. Strings also follow 0-based indexing. 
// For instance:


public class AccessIndividualChar {
    public static void main(String[] args) {
        
        Solution sol = new Solution();

        String s = "Hello";
        sol.accessCharacters(s);
    }
}

class Solution {
    public void accessCharacters(String s) {
        for ( int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}