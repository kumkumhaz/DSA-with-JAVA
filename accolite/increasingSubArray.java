public class increasingSubArray {
    public static int increasingSubArr(int[] a) {
        if (a.length == 1) {
            return 1;
        }
        if (a.length == 2) {
            if (a[1] - a[0] - 1 == 0) {
                return 2;
            } else {
                return 1;
            }
        }
        int[] li = new int[a.length];
        int i = 0;
        int count = 0;
        while (i < a.length - 1) {
            int j = i + 1;
            if (a[j] - a[i] == 1) {
                li[count] = a[j];
                count++;
                i++;
            } else if (a[j + 1] - a[i] == 1) {
                li[count] = a[j];
                count++;
                i += 2;
            } else {
                i++;
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 5, 3, 4 };
        System.out.println(increasingSubArr(arr1));
        int[] arr2 = { 1, 2 };
        System.out.println(increasingSubArr(arr2));
    }
}

// import java.util.Scanner;

// public class increasingSubArray {
// public static int increasingSubArr(int[] a) {
// int[] li = new int[a.length];
// int j = 0;
// li[j] = a[0];
// for (int i = 1; i < a.length; i++) {
// if (li[j] < a[i]) {
// j++;
// li[j] = a[i];
// } else {
// li[j] = a[i];
// }
// }
// return j + 1;
// }

// public static void increasingSubArr(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int[] arr = new int[n];
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }
// System.out.println(increasingSubArr(arr));
// sc.close();
// }
// }
