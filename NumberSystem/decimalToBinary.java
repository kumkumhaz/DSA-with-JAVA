package NumberSystem;

import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal_num = sc.nextInt();
        int ans = 0;
        int multiplyer = 1;
        while(decimal_num > 0){
            int parity = decimal_num % 2;
             ans += parity*multiplyer;
             decimal_num = decimal_num/2;
             multiplyer*=10;
        }
        System.out.println(ans);
        sc.close();
    }
    
}
