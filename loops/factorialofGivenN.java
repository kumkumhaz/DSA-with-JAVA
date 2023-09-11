package loops;

import java.util.Scanner;

public class factorialofGivenN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int my_n = n;
        int fact = 1;
        while(n>0){
            fact= fact*n;
            n--;
        } 
        System.out.println("Factorial of "+ my_n + " : " + fact);
        sc.close();
    }
}
