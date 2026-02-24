package Learn_the_basics.Things_to_know_in_any_lang.Cpp_Basics;

// Strings in C++ can be assigned and passed like primitive types. Assigning one string to another makes a deep copy of the 
// character sequence:

// In C++, strings can be seamlessly passed between functions. When you pass a string as an argument to a function, you're essentially 
// making a copy of the string. Any changes made to the string within the function won't affect the original string outside of it.

// Copying strings is not merely a superficial process, it involves creating a new string with an identical character sequence. Whether 
// you're assigning a string to another or passing it to a function, you're essentially creating a fresh copy.

public class PassingReturningAssigning {
    public static void main(String[] args) {
        
        StringModifier sol = new StringModifier();

        String og = "Hello";

        String result = sol.modifyString(og);

        System.out.println("Original string: " + og);
        System.out.println("Returned string: " + result);

    }
}

class StringModifier {
    public String modifyString(String s) {
        String newStr = s;

        newStr += " World";

        return newStr;

    }
}