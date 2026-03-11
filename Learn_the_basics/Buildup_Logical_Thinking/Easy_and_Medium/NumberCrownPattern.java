public class NumberCrownPattern {
    public static void main(String[] args) {
        
        NumberCrownPattern ncp = new NumberCrownPattern();
        int N = 5;
        ncp.pattern12(N);
    }

    public void pattern12(int N) {
        int spaces = 2 * (N - 1);

        for (int i = 1; i <= N; i++) {
            
            for (int j = 1; j <=i; j++) {    // left numbers
                System.out.print(j);
            }

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
            spaces -= 2;
        }
    }
}
