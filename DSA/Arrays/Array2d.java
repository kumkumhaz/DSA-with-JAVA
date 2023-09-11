/*
 *  
Example 1:
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
Example 2:
Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
Example 3:
Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
Output: 17
 */

/*
 * tc = O(n*m)
 */
package Arrays;

public class Array2d {
    public static int maximumWealth(int[][] arr){
        int maxWealth = 0;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
           for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            if(sum > maxWealth){
                maxWealth = sum;
            }
        }
        return maxWealth;
   }

   public static void main(String[] args) {
    int[][] arr = {{1,2,3},{3,2,1}};
    int maxWealth = maximumWealth(arr);
        System.out.println(maxWealth);
   }
}

