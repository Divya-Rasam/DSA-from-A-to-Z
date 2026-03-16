import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseAGivenArrayyBuiltIn {
    public static void main(String[] args) {
        
        List<Integer> arr = new ArrayList<>(Arrays.asList( 2, 3, 4, 5));

        ReverseBuiltIn rbi = new ReverseBuiltIn();
        rbi.reverseArray(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


class ReverseBuiltIn {
    public void reverseArray(List<Integer> arr) {
        Collections.reverse(arr);
    }
}