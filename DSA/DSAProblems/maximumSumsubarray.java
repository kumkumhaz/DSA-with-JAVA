package DSAProblems;

import java.util.Scanner;

// public class maximumSumsubarray {
//      public static int find_maximum_subarray(int arr[],int length)
//     {
//       int maxSum = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 int sum = 0; 
//                 for (int k = i; k <= j; k++) {
//                    sum += arr[k];
//                 }
//                   maxSum = Math.max(maxSum, sum);
//             }
//         }
//         return maxSum;
       
//     }
//      public static void main(String[]args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         int max= find_maximum_subarray(arr,n);
//         System.out.println(max);
//         sc.close();
//     }
// }

public class maximumSumsubarray{

      public static int maxSubarray( int[] arr) {
      int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the minimum possible value
        for (int i = 0; i < arr.length; i++) {
              int sum = 0; // Reset sum for each starting index
             for (int j = i; j < arr.length; j++) {
               sum += arr[j]; // Add the current element to the sum
               maxSum = Math.max(maxSum, sum); // Update maxSum if a new maximum is found
    }
}

return maxSum;     
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the digits of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max= maxSubarray(arr);
        System.out.println(max);
        sc.close();
    }
}