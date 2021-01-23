package hackerrank.practice;

import java.util.Arrays;

public class HappyLadybugs {

    public static void main(String[] args) {
        happyLadybugs("__");
    }

    // Complete the happyLadybugs function below.
    static String happyLadybugs(String b) {

        boolean canSort = false;
        if (b.contains("_")) {
            canSort = true;
            b = b.replaceAll("_", "");
        }

        if (b.length() == 0) {
            return "NO";
        }

        char[] chars = b.toCharArray();

        if (canSort) {
            Arrays.sort(chars);
        }

        char c = chars[0];
        int count = 1;

        for (int i =1;i<chars.length;i++) {
            if (c == chars[i]) {
                count++;
            } else {
                if (count == 1) {
                    return "NO";
                } else {
                    count = 1;
                    c = chars[i];
                }
            }
        }

        if (count == 1) {
            return "NO";
        }
        return "YES";
    }
}
