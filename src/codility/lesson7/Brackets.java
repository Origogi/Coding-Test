package codility.lesson7;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Brackets {

    public int solution(String S) {
        Stack<Character> stack = new Stack<>();

        for (char c : S.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }

            if (stack.size() == 0) {
                return 0;
            }

            char top = stack.pop();

            if (top == '(' && c != ')') {
                return 0;
            }


            if (top == '{' && c != '}') {
                return 0;
            }

            if (top == '[' && c != ']') {
                return 0;
            }


        }

        return stack.size() == 0 ? 1 : 0;
    }

    public int solution1(String S) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();

        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');

        for (char c : S.toCharArray()) {
            if (map.keySet().contains(c)) { //Open
                stack.push(c);
            } else {  // Close
                if (stack.isEmpty()) {
                    return 0;
                }
                char open = stack.pop();
                if (map.get(open) != c) {
                    return 0;
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;

    }
}
