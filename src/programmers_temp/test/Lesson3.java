package programmers_temp.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Lesson3 {

    public static void main(String[] args) {
        String input = "ab2{b3{ab}3{tc}}";

        new Lesson3().solution(input);
    }

    public static String solution(String ecryptedString) {
        String answer = "";



        List<String> tokenList = split(ecryptedString);

        Stack<String> stack = new Stack<>();

        while (!tokenList.isEmpty()) {
            String token = tokenList.remove(0);

            if (token.equals("}")) {
                String str = "";
                while (true) {
                    String temp = stack.pop();
                    if (temp.equals("{")) {
                        break;
                    }
                    str = temp + str;
                }

                int count = Integer.parseInt(stack.pop());
                String temp = "";
                for (int i = 0; i < count; i++) {
                    temp += str;
                }
                stack.push(temp);
            }
            else {
                stack.add(token);
            }
        }


        while (!stack.empty()) {
            answer = stack.pop() + answer;
        }
        return answer;

    }



    private static List<String> split(String ecryptedString) {
        ecryptedString = ecryptedString.replaceAll("\\{", " \\{ ");
        ecryptedString = ecryptedString.replaceAll("\\}", " \\} ");

        List<String> tokenList = new ArrayList();

        for (String token : ecryptedString.split(" ")) {
            if (token.isEmpty()) {
                continue;
            }

            char initial = token.charAt(0);

            if ('0' <= initial && '9' >= initial) {
                String digit = token.replaceAll("[^0-9]", "");
                String chars = token.replaceAll("[^a-z]", "");

                tokenList.add(digit);
                if (!chars.isEmpty()) {
                    tokenList.add(chars);
                }
            } else if ('a' <= initial && 'z' >= initial) {
                String chars = token.replaceAll("[^a-z]", "");
                String digit = token.replaceAll("[^0-9]", "");
                tokenList.add(chars);
                if (!digit.isEmpty()) {
                    tokenList.add(digit);
                }
            } else {
                tokenList.add(token);
            }
        }
        return tokenList;
    }



}
