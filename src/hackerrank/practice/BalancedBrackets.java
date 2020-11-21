package hackerrank.practice;

import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
        System.out.println(isBalanced("{[()]}"));
        System.out.println(isBalanced("{[(])}"));
        System.out.println(isBalanced("{{[[(())]]}}"));

    }

    // Complete the isBalanced function below.
    static String isBalanced(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (isLeft(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }

                char top = stack.pop();

                if (!isPaired(top, c)) {
                    return "NO";
                }
            }
        }

        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }

    private static boolean isPaired(char left, char right) {

        switch (left) {
            case '{':
                return right == '}';
            case '[':
                return right == ']';
            case '(':
                return right == ')';
        }
        return false;

    }

    private static boolean isLeft(char c) {
        switch (c) {
            case '{':
            case '[':
            case '(':
                return true;
        }
        return false;
    }

}
