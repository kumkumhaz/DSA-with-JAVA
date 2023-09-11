package ScannerClass;


import java.util.Scanner;



class user{
    public static void main( String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        
        System.out.print(n);
        System.out.println(s);

        sc.close();
    }       

}