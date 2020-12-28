package programmers_temp.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Lesson4 {


    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

//        String input = "1 3 + 5 *";

        String[] tokens = input.split(" ");

        Stack<String> stack = new Stack<>();

        for (String token : tokens) {
            if (isDigit(token)) {
                stack.push(token);
            } else {
                double a = Double.parseDouble(stack.pop());
                double b = Double.parseDouble(stack.pop());
                double c = 0;

                if (token.equals("+")) {
                    c = a + b;
                } else {
                    c = a * b;
                }
                stack.push(String.valueOf(c));
            }
        }

        System.out.println(stack.peek());
    }

    private static boolean isDigit(String token) {
        if (token.startsWith("*") || token.startsWith("+")) {
            return false;
        }
        return true;
    }
}
