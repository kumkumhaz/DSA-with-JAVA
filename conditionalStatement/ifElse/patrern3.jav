import java.util.Scanner;

/*
 * 1 2 3
 * 1 2 3
 * 1 2 3 
 */
public class pattern3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i < n){
            int j = 1;
            while(j < n){
                System.out.print(j +" ");
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}