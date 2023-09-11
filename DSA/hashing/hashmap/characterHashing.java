package hashing.hashmap;

import java.util.HashMap;

// public class characterHashing {
    

//     /*
//      * NIEVE APPRAOCH
//      */
//     public static void main(String[] args) {
//         String str = "stringsssssssssssiiiiiiiiis";
//         char ch = 's';
//         System.out.print(countChar(str, ch));
//     }

//     static int countChar(String str, char ch){
//         int count = 0; 
//         for(int i = 0;i < str.length(); i++){
//           if(str.charAt(i) == ch){
//             count++;
//           }
//     }return count;

//     }
// }


// public class characterHashing {
//   public static void countFre(String str) {
//       boolean[] visited = new boolean[256]; // Assuming ASCII characters
//       int[] frequency = new int[256]; // Frequency count for each character

//       for (int i = 0; i < str.length(); i++) {
//           char ch = str.charAt(i);
//           frequency[ch]++;
//       }

//       for (int i = 0; i < str.length(); i++) {
//           char ch = str.charAt(i);
//           if (!visited[ch]) {
//             visited[ch] = true;
//             System.out.println(ch + " " + frequency[ch]);
//           }
//       }
//   }

//   public static void main(String[] args) {
//       String str = "stringsssssssssssiiiiiiiiis";
//       countFre(str);
//   }
// }




/*
 * tc = O(n^2)
 * Sc = O(n)
 */
// public class characterHashing{
//   public static void countFre(String str) {
//     boolean visited[] = new boolean[str.length()];
//     for (int i = 0; i < str.length(); i++) {
//         if (visited[i] == true) {
//             continue;
//         }
//         int count = 1;
//         for (int j = i + 1; j < str.length(); j++) {
//             if (str.charAt(i) == str.charAt(j)) {
//                 visited[j] = true;
//                 count++;
//             }
//         }
//         System.out.println(str.charAt(i) + " " + count);
//     }
// }

// public static void main(String[] args) {
//     String str = "kumkum";

//     countFre(str);
// }
// }



public class characterHashing{

public static void countFre(String str){
  HashMap<Character, Integer> mp = new HashMap<>();
  for(int i = 0 ; i < str.length(); i++){
     if(mp.containsKey(str.charAt(i))){
      mp.put(str.charAt(i), mp.get(str.charAt(i))+1);
     }else{
      mp.put(str.charAt(i), 1);
     }
  }
  for(HashMap.Entry<Character, Integer>  e: mp.entrySet()){
    System.out.println(e.getKey()+ " "+ e.getValue());
  }
}

  public static void main(String[] args) {
     String str = "kumkumum";
     countFre(str);   
  }
}