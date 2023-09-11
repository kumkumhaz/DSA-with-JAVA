// PARAMETERIZED WAY

package recursion;

// public class sumOfNnumbers {
//     static void fun(int i, int sum){
//         if(i < 1){
//             System.out.println(sum);
//             return;
//         }
//         fun(i-1, sum+i);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         fun(n,0);
//     }
// }

//FUNCTIONAL WAY

public class sumOfNnumbers{
    static int fun(int n){
        if (n == 0){
            return 0;
        }
        return n + fun(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fun(n));
    }
}

