public class RightAngledTrianglePattern {
    
    public void pattern2(int N) {
        for ( int i = 0; i < N; i++) {
            for ( int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RightAngledTrianglePattern ratp = new RightAngledTrianglePattern();
        int N = 8;
        ratp.pattern2(N);
    }
}
