public class FindGCDOfTwoNumberss {
    public static void main(String[] args) {
        int n1 = 20; 
        int n2 = 15;
        int gcd = findGCD(n1, n2);
        System.out.println("GCD of " + n1 + " and " + n2 + " is : " + gcd);
    }

    public static int findGCD(int n1, int n2) {
        for (int i = Math.min(n1, n2); i > 0; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
