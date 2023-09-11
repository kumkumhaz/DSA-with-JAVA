//1480. Running Sum of 1d Array #leetcode


package Arrays;

public class runningSum {
    public static int[] runningsum(int[] arr){
        int[] res = new int[arr.length];
        res[0] = arr[0];
        for(int i = 1; i <= arr.length; i++){
            res[i]  = res[i-1] + arr[i];
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        System.out.println(runningsum(arr));
    }
}
