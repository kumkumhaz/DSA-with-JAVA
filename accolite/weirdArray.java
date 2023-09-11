import java.util.Arrays;

public class weirdArray {
    public static int weiredArray(int[] a) {
        if (a.length < 2) {
            return 0;
        }
        int[] li = new int[a.length];
        int count = 0;
        int maximum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                } else {
                    li[i] = count;
                    count = 0;
                    break;
                }
            }
        }
        maximum = Arrays.stream(li).max().getAsInt();
        return maximum;
    }

    public static void main(String[] args) {
        int[] a = { 3, 3, 1, 3, 3 };
        int[] b = { 5 };
        System.out.println(weiredArray(a));
        System.out.println(weiredArray(b));
    }
}
