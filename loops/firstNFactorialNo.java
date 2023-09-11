/*
 * Print the first n factorial numbers 
 * given n = 4
 * ans 
 * fact 1 = 1
 * fact 2 = 2
 * fact 3 = 3
 * fact 4 = 4
 * fact 5 = 5
 */
package loops;

import java.util.Scanner;

public class firstNFactorialNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1 ; i <= n ; i++){
            fact = fact *i;
            System.out.println("Factorial of " + i+ " : " + fact);
        }

        sc.close();

    }

    
}
