package codility.java.stack_queue;

import java.util.Stack;

public class Brackets {

    public static void main(String[] args) {

    }

    public int solution(String S) {

        Stack<Character> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (c == '[' || c == '{' || c== '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return 0;
                }
                char top = stack.pop();

                if (top == '(' && c != ')') {
                    return 0;
                }
                else if (top == '{' && c != '}') {
                    return 0;
                }
                else if (top == '[' && c != ']') {
                    return 0;
                }
            }

        }
        return stack.isEmpty()? 1: 0;
    }
}
