package hackerrank.practice;

import java.util.Stack;

public class SuperReducedString {
    // Complete the superReducedString function below.
    static String superReducedString(String s) {

        Stack<Character> stack = new Stack();

        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            }
            else {
                if (stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        String ans = stack.isEmpty() ? "Empty String" : "";


        while (!stack.isEmpty()) {
            ans = stack.pop() + ans;
        }

        return ans;

    }
}
