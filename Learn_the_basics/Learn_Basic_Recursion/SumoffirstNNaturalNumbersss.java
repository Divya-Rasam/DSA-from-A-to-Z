import java.util.Scanner;

public class SumoffirstNNaturalNumbersss {
    public static void main(String[] args) {
        
        Solution3 sol = new Solution3();
        java.util.Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sol.sumOfNaturalNumbers(n));
        sc.close();
    }
}

class Solution3 {
    public int sumOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        }

        return n + sumOfNaturalNumbers(n-1);
    }
}