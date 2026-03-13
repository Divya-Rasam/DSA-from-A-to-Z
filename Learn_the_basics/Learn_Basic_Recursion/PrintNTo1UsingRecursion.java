public class PrintNTo1UsingRecursion {
    public static void main(String[] args) {
        
        int n = 4;

        NTo1Sol(n);
        System.out.println();

    }

    public static void NTo1Sol(int cur) {

        if(cur < 1) return;

        // NTo1Sol(cur-1);               // BACKTRACKING


        System.out.print(cur + " ");
        NTo1Sol(cur-1);               // BACKTRACKING

    }
}
