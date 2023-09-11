package loops;

import java.util.Scanner;

public class aRaiseToThePowerb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();
        int real_power= power;
        int ans = 1;
        while(power>0){
            ans = ans *base;
            power--;
        }
        System.out.println(base +" to the power " + real_power +" = "+ ans);
        sc.close();
    }
    
}
