import java.util.*;

// TC = O(N) SC = O(N)
// approach 1
public class validParenthesis {
    static boolean areBracketsBalanced(String expr) {
        Deque<Character> stack = new ArrayDeque<Character>();
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[') {
                        return false;
                    }
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[') {
                        return false;
                    }
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{') {
                        return false;
                    }
                    break;
            }
        }
        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        String expr = "([{)}])";
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}

// public class validParenthesis {
// public boolean isValid(String expr) {
// Stack<Character> stack = new Stack<>();
// for (int i = 0; i < expr.length(); i++) {
// char a = expr.charAt(i);
// if (a == '(' || a == '[' || a == '{')
// stack.push(a);
// else if (stack.empty())
// return false;
// else if (a == ')' && stack.pop() != '(')
// return false;
// else if (a == ']' && stack.pop() != '[')
// return false;
// else if (a == '}' && stack.pop() != '{')
// return false;
// }
// return stack.empty();
// }

// public static void main(String[] args) {
// String expr = "([{)}])";
// if (isValid(expr))
// System.out.println("Balanced ");
// else
// System.out.println("Not Balanced ");
// }
// }
