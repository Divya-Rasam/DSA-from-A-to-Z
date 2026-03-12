public class CheckIfANumberIsArmstrongNumberOrNot {
    // An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
    public static void main(String[] args) {
        
        int n = 153;
        CheckIfANumberIsArmstrongNumberOrNot caon = new CheckIfANumberIsArmstrongNumberOrNot();
        caon.pattern17(n);

    }

    public void pattern17(int n) {

        int original = n;

        int digits = 0;
        int temp = n ;

        while (temp > 0) {
            digits++;
            temp = temp/10;
        }

        int sum = 0;
        temp = n;

        while(temp > 0) {
            int ld = temp % 10;
            sum += Math.pow(ld, digits);
            temp = temp / 10;
        }

        if (sum == original) {
            System.out.println(n + " is arm");
        } else {
            System.out.println(n + " is not");
        }

    }
}
