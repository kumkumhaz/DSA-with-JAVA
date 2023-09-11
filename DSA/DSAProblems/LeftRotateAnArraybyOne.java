
// Sample Input 1:
// 4
// 5 7 3 2 
// Sample Output 1:
// 7 3 2 5
// Explanation Of Sample Input 1:
// Move the first element to the last and rest all the elements to the left.
// Sample Input 2:
// 5
// 4 0 3 2 5 
// Sample Output 2:
// 0 3 2 5 4
// Explanation Of Sample Input 2:
// Same as sample input 1, Move the first element to the last and rest all the elements to the left
// Expected Time Complexity:
// O( n ), Where ‘n’ is the size of an input array ‘arr’.

package DSAProblems;


public class LeftRotateAnArraybyOne{


    //BRUET FORCE SOLUTION
//     Complexity Analysis
// Time Complexity: O(n), as we iterate through the array only once.

// Space Complexity: O(n) as we are using another array of size, same as the given array.

    // public static int[] rotate(int[] arr){
    //     int[] result = new int[arr.length];
    //     for(int i = 1; i < arr.length;i++){
    //         result[(i-1)] = arr[i];
    //     }
    //     result[arr.length-1] = arr[0];
    //     return result;
    // }


    //OPTIMAL SOLUTION

    public static int[] rotate(int[] arr){
         int temp = arr[0];
        for(int i = 1; i < arr.length;i++){
            arr[(i-1)] = arr[i];
        }
        arr[arr.length-1] = temp;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,8,9,0};
        int[] rotatedArr = rotate(arr);
        for(int j = 0;j < rotatedArr.length; j++){
            System.out.print(rotatedArr[j]+" ");
        }
    }
}
