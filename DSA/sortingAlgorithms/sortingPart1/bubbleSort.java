package sortingAlgorithms.sortingPart1;
/// WORST CASE ANALYSIS 
/*
 *  TC  = O(n^2)
 */
public class bubbleSort {
    public static void bubble(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,3,5,1,0,9};
      bubble(arr);
      for(int num : arr){
        System.out.print(num+" ");
      }
    }
}





// BREST CASE ANALYSIS
/*
 *  tc = O(n)
 */
// public class bubbleSort{
//     public static void bubble(int[]arr){
//         for(int i = 0; i < arr.length-1; i++){
//             int didSwap = 0;
//             for(int j = 0; j < arr.length-i-1; j++){
//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                     didSwap = 1;
//                 }
//             }
//             if(didSwap == 0){
//                 break;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6};
//         bubble(arr);
//         for(int num : arr){
//             System.out.println(num+" ");
//         }
//     }
// }
