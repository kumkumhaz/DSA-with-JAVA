
/*
Write a program to print whether a given number is an Armstrong number or not..
(Armstrong number is a number in which all the sum of cubes of digits is equal to the number
Example:-
Input
n=153
Output
true
*/

package basicProblem;

import java.util.Scanner;

public class armstrongNo {
    public static boolean isArmstrong(int n) {
        int original_num = n;
        int sum = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            sum += lastDigit * lastDigit * lastDigit;
            n /= 10;
        }
        if(original_num == sum){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(0);
        sc.close();
        boolean isArmstrong = isArmstrong(num);
        System.out.println(isArmstrong);
    }
}

