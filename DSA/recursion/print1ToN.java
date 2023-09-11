package recursion;

public class print1ToN {
       
    
    static void printNumbers(int N) {
        if (N <= 0) {
            return;  // Base case: stop recursion when N is non-positive
        }
        
        printNumbers(N - 1);  // Recursively call the function with N-1
        
        System.out.print(N + " ");  // Print the current number
    }
    public static void main(String[] args) {
      
        printNumbers(5);
    }  
}
