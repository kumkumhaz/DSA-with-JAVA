// /*
//  * count the number of digits for a given nubber n
//  */
package loops;
import java.util.*;

public class findNoOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int noOfDigits = 0;
            int original_n = n;
            while(n >0){
                n= n/10;
                noOfDigits++;

            }
            System.out.println("no of digits in " + original_n + " is "+ noOfDigits);
            sc.close();
        
    }
    
}
