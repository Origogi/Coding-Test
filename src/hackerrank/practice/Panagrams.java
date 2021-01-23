package hackerrank.practice;

import java.util.HashSet;
import java.util.Set;

public class Panagrams {
    // Complete the pangrams function below.
    static String pangrams(String s) {

        s = s.toLowerCase().replaceAll(" ","");

        Set<Character> set = new HashSet();

        for (char c : s.toCharArray()) {
            set.add(c);
        }

        return set.size() == 26 ? "pangram " : "not pangram ";
    }
}
