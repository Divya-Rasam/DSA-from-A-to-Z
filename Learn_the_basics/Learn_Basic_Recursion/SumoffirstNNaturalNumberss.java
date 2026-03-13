import java.util.Scanner;

public class SumoffirstNNaturalNumberss {
    public static void main(String[] args) {
        
        Solutionr sol = new Solutionr();
        java.util.Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sol.sumOfNaturalNumbers(n));
        sc.close();
    }
}


class Solutionr {
    
    public int sumOfNaturalNumbers(int n) {
        return (n * (n+1)) / 2;
    }
}