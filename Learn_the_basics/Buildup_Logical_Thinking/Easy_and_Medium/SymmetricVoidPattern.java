public class SymmetricVoidPattern {
    public static void main(String[] args) {
        
        int num = 7;

        Solution1 sol = new Solution1();
        sol.pattern19(num);
    }


}

class Solution1 {
    public void pattern19(int n) {
        int iniS = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }
            iniS += 2;
            System.out.println();
        }
        iniS = 2 * n - 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j< iniS; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            iniS -=2;
            System.out.println();
        }
    }
}