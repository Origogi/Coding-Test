package hackerrank.practice;

import java.util.*;

public class SherlockAndAnagrams {

    public static void main(String[] args) {
        sherlockAndAnagrams("ifailuhkqq");
    }

    public static int sherlockAndAnagrams(String s) {
        int ans = 0;

        for (int length = 1; length < s.length(); length++) {
            List<String> words = new LinkedList<>();
            for (int i = 0; i + length <= s.length(); i++) {
                String word = s.substring(i, i + length);
                words.add(word);
            }
            for (int i = 0; i < words.size() - 1; i++) {
                for (int j = i + 1; j < words.size(); j++) {
                    if (isAnagram(words.get(i), words.get(j))) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    private static boolean isAnagram(String s1, String s2) {
        int[] sum = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            sum[s1.charAt(i) - 'a']++;
            sum[s2.charAt(i) - 'a']--;
        }

        for (int s : sum) {
            if (s != 0) {
                return false;
            }
        }
        return true;
    }

}
