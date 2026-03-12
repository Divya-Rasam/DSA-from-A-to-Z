public class AlphaTrianglePattern {
    public static void main(String[] args) {
        
        int n = 5;
        pattern18(n);

    }

    public static void pattern18(int n) {

        for ( int i = 0; i < n; i++) {
            for (char ch = (char)('A' + n - 1-i); ch <= (char)('A'+ n - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
