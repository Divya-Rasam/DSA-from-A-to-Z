public class FindGCDOfTwoNumbersss {
    public static void main(String[] args) {
        int n1= 20, n2 = 15;
        int gcd = findGcd(n1, n2);
        System.out.println("GCD of " + n1 + " and " + n2 + " is " + gcd);
    }

    public static int findGcd(int a, int b) {
        while (a > 0 && b > 0 ) {
            if(a > b) {
                a = a% b;
            } else {
                b = b % a;
            }
        }

        if(a == 0) {
            return b;
        }

        return a;
    }
}

// Euclidean Algorithm




// ⭐ One More Tip (Very Important)

// Your code works perfectly, but many interviewers write it like this:

// while(b != 0){
//     int temp = b;
//     b = a % b;
//     a = temp;
// }
// return a;

// Both are Euclidean Algorithm.