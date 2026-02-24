package Learn_the_basics.Things_to_know_in_any_lang.Cpp_Basics;

import java.util.*;

// The == known as the equality operator is used for comparing two values to check if they are equal. In programming, it's commonly 
// used to compare variables, such as numbers or strings, to determine if they have the same value. For example, x == y will return 
// true if x is equal to y, and false otherwise.

// The != known as the inequality operator is used to check if two values are not equal. It's the opposite of the equality operator. 
// If the values being compared are not equal, != returns true; if they are equal, it returns false. We can check if two strings are 
// equal or not and at the same time we can also check whether particular characters of two strings are equal or not.

public class StringComparison {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();

        String str2 = sc.next();

        StringComparator sol = new StringComparator();

        if (sol.compareStrings(str1, str2))
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");

        sc.close();


    }
}

class StringComparator {
    public boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }
}