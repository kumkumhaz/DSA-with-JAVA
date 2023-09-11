// package hashing.hashmap;
// public class frequencyOfArray{
//   // nieve approach - iterative approach
//   /*
//    * tc = O(n) => for only 1 number
//    */

//   static int func(int nums, int[] arr){
//     int count = 0; 
//     for(int i = 0 ; i < arr.length; i++){
//        if(arr[i] == nums){
//         count += 1;
//        }
//     }
//     return count;
//   }

//   public static void main(String[] args) {
//     int[] arr = {2,2,4,4,6,9,8};
//     System.out.println(func(1, arr));
//   } 
// }










// package hashing.hashmap;

// public class frequencyOfArray {
    // public static void countFre(int arr[], int n) {
    //     boolean visited[] = new boolean[arr.length];
    //     for (int i = 0; i < n; i++) {
    //         if (visited[i] == true) {
    //             continue;
    //         }
    //         int count = 1;
    //         for (int j = i + 1; j < n; j++) {
    //             if (arr[i] == arr[j]) {
    //                 visited[j] = true;
    //                 count++;
    //             }
    //         }
    //         System.out.println(arr[i] + " " + count);
    //     }
    // }

    // public static void main(String[] args) {
    //     int[] arr = {2, 2, 4, 4, 6, 9, 8};
    //     int n = arr.length;

    //     countFre(arr, n);
    // }
// }



package hashing.hashmap;

import java.util.HashMap;
import java.util.Map;

public class frequencyOfArray {
    public static void countFre(int arr[], int n) {
      HashMap<Integer,Integer> map = new HashMap<>();
       for(int i = 0; i < n ; i++){
        if(map.containsKey(arr[i])){
            map.put(arr[i],map.get(arr[i])+1);
        }else{
            map.put(arr[i],1);
        }
       }
       for(Map.Entry<Integer,Integer> e: map.entrySet()){
        System.out.println(e.getKey()+" "+ e.getValue());
       }
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 4, 4, 6, 9, 8,2};
        int n = arr.length;

        countFre(arr, n);
    }
}

