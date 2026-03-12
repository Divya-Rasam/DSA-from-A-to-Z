public class Print1ToNUsingRecursion {
    public static void main(String[] args) {
        
        int n = 8;
        Solutionn sol = new Solutionn();
        sol.printOnetoN(n , 1);
        System.out.println();

    }

}

class Solutionn {
    public void printOnetoN (int n, int current) {
        if (current > n) return;

        System.out.print(current + " ");
        printOnetoN(n, current + 1);


        //  System.out.print(current + " ");     // backtrackingggg output
    }
}
