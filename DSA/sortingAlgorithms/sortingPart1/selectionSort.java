

package sortingAlgorithms.sortingPart1;

// public class selectionSort {
//     public static void selection(int[] arr) {
//         for (int i = 0; i <= arr.length - 2; i++) {
//             int minIndex = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] < arr[minIndex]) {
//                     minIndex = j;
//                 }
//             }
//             swap(arr, minIndex, i);
//         }
//     }

//     public static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     public static void main(String[] args) {
//         int[] arr = {2, 5, 1, 7, 0, 9, 4};
//         selection(arr);
//         // Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }
public class selectionSort {
    public static void selection(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 0, 9, 4};
        selection(arr);
        // Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

