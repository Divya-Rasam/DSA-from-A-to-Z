package Learn_the_basics.Things_to_know_in_any_lang.For_Loops;

public class NestedForLoops {
    public static void main(String[] args) {
        
        for ( int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
    
}
