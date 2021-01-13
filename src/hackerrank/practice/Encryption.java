package hackerrank.practice;

import java.util.LinkedList;
import java.util.List;

public class Encryption {
    // Complete the encryption function below.
    static String encryption(String s) {
        s = s.replaceAll(" ", "");

        int cols = (int)Math.ceil((double)Math.sqrt(s.length()));

        StringBuilder ans = new StringBuilder();

        int count = s.length();

        List<String> tokens = new LinkedList();

        for (int i = 0; i< s.length();i += cols) {
            int start = i;
            int end = i + cols;

            if (end > s.length()) {
                end = s.length();
            }

            tokens.add(s.substring(start, end));
        }

        for (int i = 0;i<cols;i++) {

            for (String token : tokens) {
                if (i < token.length()) {
                    ans.append(token.charAt(i));
                }
            }
            ans.append(" ");

        }


        return ans.toString();
    }
}
