package NumberSystem;

import java.util.Scanner;

public class DecimalToBinaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary_n = sc.nextInt();
        int decimal_ans = 0;
// (1001)2 = 1*2^3 + 0*2^2 + 0*2^1 + 1*2^0
         int power = 1; // 2^0 = 1

         while(binary_n>0){
            int unit_digit = binary_n % 10;
            decimal_ans += (unit_digit*power);
            binary_n = binary_n/10;
            power *= 2;
         }
         System.out.println(decimal_ans);;
        sc.close();
    }
    
}
