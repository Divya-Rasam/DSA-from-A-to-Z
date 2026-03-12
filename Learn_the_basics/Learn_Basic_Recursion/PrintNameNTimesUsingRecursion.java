public class PrintNameNTimesUsingRecursion {
    public static void main(String[] args) {
        
        Solution sol = new Solution();
        int n = 8;
        String name = "Divya";

        sol.printName(name, 0, n);
    }
}

class Solution {
    public void printName(String name, int count, int n) {

        if (count == n) return;

        System.out.println(name);

        printName(name, count + 1, n);
    }
}