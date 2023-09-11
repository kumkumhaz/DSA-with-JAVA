package loops;
import java.util.Scanner;
class sumOfStreamOfIntegers{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int sum =0;
       while(num != -1){
        sum+= num;
        num = sc.nextInt();
       }
       System.out.println(sum);
       sc.close();
    }
}