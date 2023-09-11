import java.util.*;

public class beautyCode {
    public static int beauty(int n, int m, String s, int[] x, int[] y) {
        Map<Character, Integer> count = new HashMap<>();
        int[] beautyValues = new int[n];
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (!count.containsKey(c)) {
                count.put(c, 1);
            } else {
                count.put(c, count.get(c) + 1);
            }
        }
        for (int i = 0; i < n; i++) {
            beautyValues[i] = count.get(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            graph.get(x[i] - 1).add(y[i] - 1);
        }
        int maxBeauty = 0;
        for (int i = 0; i < n; i++) {
            maxBeauty = Math.max(maxBeauty, beautyValues[i]);
        }
        if (maxBeauty == 1) {
            return -1;
        }
        boolean[] visited = new boolean[n];
        int res = -1;
        for (int i = 0; i < n; i++) {
            if (!visited[i] && beautyValues[i] == maxBeauty) {
                List<Integer> stack = new ArrayList<>();
                stack.add(i);
                while (!stack.isEmpty()) {
                    int node = stack.get(stack.size() - 1);
                    stack.remove(stack.size() - 1);
                    if (!visited[node])
                        visited[node] = true;
                    for (int nei : graph.get(node)) {
                        if (!visited[nei]) {
                            stack.add(nei);
                        }
                    }
                }
            }
            res = maxBeauty;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 5;
        int m = 4;
        String s = "abaca";
        int[] x = { 1, 1, 3, 4 };
        int[] y = { 2, 3, 4, 5 };
        System.out.print(beauty(n, m, s, x, y));

    }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int m = sc.nextInt();
    // String s = sc.next();
    // int[] x = new int[m];
    // int[] y = new int[m];
    // for (int i = 0; i < m; i++) {
    // x[i] = sc.nextInt();
    // y[i] = sc.nextInt();
    // }
    // System.out.print(beauty(n, m, s, x, y));
    // sc.close();
    // }
}
/*
 * 5
 * 4
 * 1 1 3 4
 * 2 3 4 5
 * 3
 */