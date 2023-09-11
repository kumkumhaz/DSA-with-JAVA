package recursion;

import java.util.Collections;
import java.util.Arrays;

//USING EXTRA SPACE
/*
 * tc = O(n)
 * sc = O(n)
 */
// public class ReverseAnArray{
//     static void reverseArray(int [] arr){
//         int n = arr.length;
//      int[] newArr = new int[n];
//      for(int i = arr.length-1; i >= 0; i--){
//         newArr[n-i-1] = arr[i];
//      }
//      for(int i = 0; i <= n-1; i++){
//         System.out.print(newArr[i]+" ");
//      }
//     }
//     public static void main(String[] args) {
//         int[] arr= { 2,4 ,5 ,7,8 ,9};
//         reverseArray(arr); 
//     }
// }


//USING SWAPPING
/*
 * tc = O(n)
 * sc = O(1)
 */
// public class ReverseAnArray {
//      static void reverseArray(int[] arr ){
//      int left = 0; int right = arr.length-1;
//      while(left <= right){
//         int temp = arr[left];
//         arr[left] = arr[right];
//         arr[right] = temp;
//         left++;
//         right--;
//      }
//      printArray(arr);    
//     }
//     static void printArray(int[] arr){
//         for(int i = 0 ; i < arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {2,4,5,8,9};
//         reverseArray(arr);
//     }
// }




// public class ReverseAnArray {
//      static void  reverseArray(int[] arr ){
//      int left = 0; int right = arr.length-1;
//      while(left <= right){
//         int temp = arr[left];
//         arr[left] = arr[right];
//         arr[right] = temp;
//         left++;
//         right--;
//      }
//      for(int i = 0 ; i < arr.length; i++){
//                 System.out.print(arr[i]+" ");
//             }
//     }
 

// public static void main(String[] args) {
//     int[] arr = {2,4,5,8,9};
//     reverseArray(arr);
// }
// }



// UASING RECURSION
// using 2 variable
/*
 * tc = O(n)
 * sc =  O(1)
 */
// public class ReverseAnArray{
//     static void reverseArray(int[]arr,int l, int r){
//      if(l < r){
//         int temp = arr[l];
//         arr[l] = arr[r];
//         arr[r] = temp;
//         reverseArray(arr, l+1, r-1);
//      }
     
//     }
//     public static void main(String[] args) {
//         int arr[] = {2,3,4,5,6,7,8,9,1};
//         int n  = arr.length;
//         reverseArray(arr, 0, n-1);
//      for(int i = 0 ; i <= arr.length-1; i ++){
//         System.out.print(arr[i]+" ");
//      }
//     }
// }

//WITH 1 VARIABLE USING RECURSION
/*
 * tc = O(n)
 * sc =  O(1)
 */
// public class ReverseAnArray{
//     static void reverseArray(int[]arr,int i){
//         int n = arr.length;
//      if(i >= n/2){
//         return;
//     }
//     int temp = arr[i];
//     arr[i] = arr[n-i-1];
//     arr[n-i-1] = temp;
//     reverseArray(arr, i+1);
     
//     }
//     public static void main(String[] args) {
//         int arr[] = {2,3,4,5,6,7,8,9,1};
//         reverseArray(arr, 0);
//      for(int i = 0 ; i <= arr.length-1; i ++){
//         System.out.print(arr[i]+" ");
//      }
//     }
// }


//UNSING JAVA INBUILT FUNCTION
public class ReverseAnArray{
 
     //Reverse array using library function
     static void reverseArray(Integer arr[]) {
        //fetching array as list object
        //reversing the fetched object
        Collections.reverse(Arrays.asList(arr));
     }
     public static void main(String[] args) {
        int n = 5;
        Integer arr[] = {5,4,3,2,1};
        reverseArray(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
         }
     }
}




