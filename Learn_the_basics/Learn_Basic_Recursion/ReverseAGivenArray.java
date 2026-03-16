public class ReverseAGivenArray {
    public static void main(String[] args) {
        
        int [] array = {1, 2, 3, 4, 5};

        ReverseAGivenArray rga = new ReverseAGivenArray();

        int [] result = rga.reverseArray(array);
    
        for (int num  : result) {
            System.out.print(num + " ");
        }

    }

    public int[] reverseArray(int [] array) {

        int n = array.length;

        int [] newArray = new int[n];

        for (int i = 0; i < n; i++ ) {
            newArray[i] = array[n -1 -i];
        }

        return newArray;
    }
}
