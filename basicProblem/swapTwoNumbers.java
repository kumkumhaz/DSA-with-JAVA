package basicProblem;


// public class swapTwoNumbers {
//     static void swap(int a, int b){
//         int temp = a; 
//         a = b;
//         b = temp;
//                 System.out.println("after swapping a = " + a + " and b = " + b);

//     }
//     public static void main(String[] args) {
//         int a= 2; int b = 6;
//         System.out.println("before swapping a = " + a + " and b = " + b);
//         swap(a, b);
//     }
// }


// public class swapTwoNumbers {
//     static void swap(int a, int b){            
//         a = a ^ b; 
//         b = a ^ b;
//         a = a ^ b;
//       /*  Dry run
//         (32, 16, 8, 4, 2, 1)
//         a = a ^ b = 10 ^ 20
//                   =    1010 
//                     ^ 10100
//                      --------
//                       11110 => 30
                                 
//         b = a ^ b = 30 ^ 20
//                   =   11110
//                     ^ 10100
//                      -------
//                       01010 => 10

//         a = a ^ b = 30 ^ 10
//                   =   11110
//                     ^ 01010
//                      -------
//                       10100 => 20
//         */
        
//         System.out.println("After swapping: a = " + a + " and b = " + b);
//     }
//     public static void main(String[] args) {
//         int a= 10; int b = 20;
//         System.out.println("before a = " + a + " and b = " + b);
//         swap(a, b);
//     }
// }

public class swapTwoNumbers {
    static void swap(int a, int b){            
        
        a = a + b; // 10+20 = 30
        b = a - b; // 30-20 = 10  => b = 10
        a = a - b; // 30- 10 = 20 => a = 20
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    public static void main(String[] args) {
        int a= 10; int b = 20;
        System.out.println("before a = " + a + " and b = " + b);
        swap(a, b);
    }
}