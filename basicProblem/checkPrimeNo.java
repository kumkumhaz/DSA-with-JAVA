package basicProblem;

public class checkPrimeNo {

    public static boolean prime(int n) {
        if(n < 2){
            return false;
        }
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
                int num = 170;
        boolean isNumPrime = prime(num);
        System.out.println(num + " is prime: " + isNumPrime);
    }
}
