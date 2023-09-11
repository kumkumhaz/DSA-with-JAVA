// Given an array nums containing n distinct numbers in the range [0, n], 
//return the only number in the range that is missing from the array.
// Example 1:

// Input: nums = [3,0,1]
// Output: 2
// Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
// 2 is the missing number in the range since it does not appear in nums.

package DSAProblems;

// import java.util.HashMap;
// import java.util.Map;

// import java.util.HashSet;

public class findMissingNumber {
    public static int missingNumber(int[] arr){
        int n = arr.length;

        // bruet force approach uing loop
        // TC = O(n^2) SC = O(1)
        // for(int i = 0; i<= n; i++){
        //     int flag = 0;
        //     for(int j = 0; j < n; j++){
        //         if(arr[i] == i){
        //             flag = 1;
        //              break;
        //         }
        //     }
        //     if(flag == 0) return i;
        // }
        
    
        //better approach using hashset, map and hashing
        // tc  and sc = O(n)
        // HashSet<Integer> set = new HashSet<>(n+1);
        // for(int i = 0; i < n; i++){
        //     set.add(arr[i]);
        // }
        // for(int i =0; i < n; i++){
        //     if(! set.contains(i)){
        //         return i;
        //     }
        // }


        // Map<Integer, Integer> numCount = new HashMap<>();
        //     for (int num : arr) {
        //     numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        // }
        
        // for (int i = 0; i <= n; i++) {
        //     if (!numCount.containsKey(i)) {
        //         return i;
        //     }
        // }    



        // int[] frequency = new int[n + 1];
        // for (int num : arr) {
        //     frequency[num]++;
        // }
        // for (int i = 0; i <= n; i++) {
        //     if (frequency[i] == 0) {
        //         return i;
        //     }
        // }
        // return -1;



        //optimal approach using Summation 
        //tc and sc
        // int totalSum = (n*(n+1))/2;
        // int sum = 0;
        // for(int i = 0; i < n ; i++){
        //     sum += arr[i];
        // }
        // int missingnum = totalSum-sum;
        // return missingnum;

       /// using bit manipulation- xor operation
       // tc and sc
       int res = n;
       for(int i = 0; i < n; i++){
         res ^= i^arr[i];
       }
       return res;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,6,7};
        int miss = missingNumber(arr);
        System.out.println(miss);
    }
}
