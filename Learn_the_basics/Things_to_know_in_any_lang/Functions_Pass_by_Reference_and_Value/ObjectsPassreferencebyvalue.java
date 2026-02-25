package Learn_the_basics.Things_to_know_in_any_lang.Functions_Pass_by_Reference_and_Value;

public class ObjectsPassreferencebyvalue {

    static void modify(Wrapper obj) {
        obj.value +=10;
    }
    public static void main(String[] args) {
        Wrapper w = new Wrapper();
        modify(w);
        System.out.println(w.value);   // output :15
    }
}

class Wrapper { 
    int value = 5;
}
