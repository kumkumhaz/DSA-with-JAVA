/*
 * Find the sum of the following series
 * S1 = 1+2-3+4-5...n
 * S2 = 1-2+3-4+5...n 
 */
package loops;

import java.util.Scanner;

public class sumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int series = n;
        int ans = 0;
        for(int i =0; i <=n ; i++){
            if(i %2 == 0){
                ans-=i;
            }else{
                ans += i;
            }
        }
        System.out.println("Sum of the series " + series + " = " + ans);
        sc.close();
    }
    
}
