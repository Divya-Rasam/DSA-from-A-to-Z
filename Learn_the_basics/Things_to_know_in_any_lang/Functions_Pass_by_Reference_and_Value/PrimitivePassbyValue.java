package Learn_the_basics.Things_to_know_in_any_lang.Functions_Pass_by_Reference_and_Value;

public class PrimitivePassbyValue {

    static void modify(int a) {
        a = a + 10;
    }

    public static void main(String[] args) {
        int x = 5;
        modify(x);
        System.out.println(x); // output 5
    }
}
