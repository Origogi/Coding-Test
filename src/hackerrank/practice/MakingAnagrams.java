package hackerrank.practice;

import java.util.Arrays;

public class MakingAnagrams {


    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {

        int[] counts = new int[26];

        for (char c : a.toCharArray()) {
            counts[c - 'a']++;
        }

        for (char c : b.toCharArray()) {
            counts[c - 'a']--;
        }
        return Arrays.stream(counts).map(v -> Math.abs(v)).sum();
    }
}
