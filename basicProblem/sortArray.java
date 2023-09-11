package basicProblem;

import java.util.Arrays;


public class sortArray {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 5, 6 };
        
        Arrays.sort(arr);
        
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    
}
