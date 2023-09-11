package basicProblem;

// public class findOddNum {
//    public static void oddNum(int n){
//     for(int i = 0; i <= n; i++){
//        if(i % 2 != 0){
//         System.out.println(i);
//        }
//     }
//    }



//     public static void main(String[] args) {
//         oddNum(9);
//     }
// }


public class findOddNum {
   public static void oddNum(int n){
           for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }
      }
    public static void main(String[] args) {
        oddNum(29);
    }
}
