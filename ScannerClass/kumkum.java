package ScannerClass;


import java.util.Scanner;



class abc{
    public static void main( String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        System.out.print(s+ " "+n);

        sc.close();
    }       

}