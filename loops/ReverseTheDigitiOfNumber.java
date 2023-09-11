/*
 * reverse the digits of a number
 * 2349 = 9432
 * TC = O(log n)
 */

package loops;

import java.util.Scanner;

public class ReverseTheDigitiOfNumber {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int reverse_n = 0;
        int original_n = n;
        while(n >0){
            int last_digit = n%10;
            reverse_n = reverse_n*10 +last_digit;
            n = n/10;
        }
        System.out.println("Reverse of the number " + original_n + " = " + reverse_n );
        sc.close();
    }
}
