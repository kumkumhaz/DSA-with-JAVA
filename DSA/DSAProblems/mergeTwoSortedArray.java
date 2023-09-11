//Merge 2 Sorted Array
// Input: ‘n’ = 5 ‘m’ = 3
// ‘a’ = [1, 2, 3, 3]
// ‘b’ = [2, 2, 4]

// Output: [1, 2, 3, 4]

// Explanation: Common elements in ‘a’ and ‘b’ are: [2]
// Distinct elements in ‘a’ are: [1, 3]
// Distinct elements in ‘b’ are: [4]
// Union of ‘a’ and ‘b’ is: [1, 2, 3, 4]

// Time Compleixty : USING MAP and MAP
// O( (m+n)log(m+n) ) . Inserting a key in map takes logN times, where N is no of elements in map.
// At max map can store m+n elements {when there are no common elements and elements in arr,arr2 are distntict}. 
//So Inserting m+n th element takes log(m+n) time. Upon approximation across insertion of all elements in worst it would take O((m+n)log(m+n) time.
// Using HashMap also takes the same time, On average insertion in unordered_map takes O(1) time but sorting the union vector takes O((m+n)log(m+n))  time. 
//Because at max union vector can have m+n elements.
// Space Complexity : O(m+n) {If Space of Union ArrayList is considered} 
// O(1) {If Space of union ArrayList is not considered}
/// Time complexity using two pointer
// tc and sc = O(n+m)
package DSAProblems;

import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.Map;
// import java.util.Set;

public class mergeTwoSortedArray {
    public static ArrayList<Integer> mergeSortedArrays(int n, int m, int[] a, int[] b) {
                        //HASHMAP
        ArrayList<Integer> Union = new ArrayList<>();
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int i = 0; i < n; i++){
        //     map.put(a[i], map.getOrDefault(a[i],0)+1);
        // }
        // for(int i = 0; i < m; i++){
        //     map.put(b[i], map.getOrDefault(b[i],0)+1);
        // }
        // for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        //     Union.add(entry.getKey());
        // }
        // return Union;

                                //HASHSET
        // Set<Integer> set = new HashSet<>();
        // for(int i = 0; i < n; i++){
        //     set.add(a[i]);
        // }
        // for(int i = 0; i < m;i++){
        //     set.add(b[i]);
        // }
        // for(int ele: set){
        //     Union.add(ele);
        // }
        // return Union;
        int i =0; int j =0;
        while(i <n && j < m){
            if(a[i] < b[j]){
                Union.add(a[i]);
                i++;
            }
            else if(a[i] > b[j]){
                Union.add(b[j]);
                j++;
            }
            else{
                Union.add(a[i]);
                i++; j++;
            }
        }
        while (i < a.length) {
            Union.add(a[i]);
            i++;
        }

        while (j < b.length) {
            Union.add(b[j]);
            j++;
        }

        return Union; 
    }
    public static void main(String[] args) {
        int n = 4;   int m = 8;
        int a[] = {1,2,3,4};
        int b[] = { 1,2,3 ,4,5 ,6,8 ,9};
        ArrayList<Integer> arr = mergeSortedArrays(n, m, a, b);
        for(int ele: arr){
            System.out.print(ele +" ");
        }
    }

}
