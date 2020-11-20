package hackerrank.practice;

import java.util.HashSet;

public class TwoStrings {

    public static void main(String[] args) {

    }

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {

        HashSet<Character> set = new HashSet<>();

        for (char c : s1.toCharArray()) {
            set.add(c);
        }

        for (char c : s2.toCharArray()) {
            if (set.contains(c)) {
                return "YES";
            }
        }
        return "NO";

    }

}
