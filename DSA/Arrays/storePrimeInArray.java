// Write a program to store first n prime numbers in an array . After storing return the array.
// Input:-
// n=5
// Output:- Return the output in the form of an array.
// 2
// 3
// 5
// 7
// 11




package Arrays;

public class storePrimeInArray {
    public static int[] prime(int n) {
        int[] arr = new int[n];
        int i = 0;
        int num = 2;
        while(i < n){
           boolean isPrime = true;
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                isPrime = false;
                break;
            }
        }
         if (isPrime) {
            arr[i] = num;
            i++;
        }
        num++;
        }
        return arr;
    }
    public static void main(String[] args) {
    int n = 5;
    int[] primeArray =prime(n);

    System.out.println("First " + n + " prime numbers:");
    for (int primen : primeArray) {
        System.out.println(primen);
    }
}

}
