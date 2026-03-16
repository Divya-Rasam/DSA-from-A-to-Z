public class ReverseAGivenArrayy {
    public static void main(String[] args) {
        
        int [] array = {5, 6, 7, 8, 9};

        Solutionnn sol = new Solutionnn();
        sol.reverseArray(array);

        for (int num: array){
            System.out.print(num + " ");
        }

    }

}

class Solutionnn {
    public void reverseArray(int [] array) {
        
        int p1 = 0;
        int p2 = array.length-1;

        while (p1 < p2) {
            int temp = array[p1];
            array[p1] = array[p2];
            array[p2] = temp;

            p1++;
            p2--;
        }
    }
}