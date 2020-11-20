package hackerrank.practice;

import java.util.HashMap;
import java.util.Map;

public class SherlockAndTheValidString {


    static String isValid(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            count++;
            map.put(c, count);
        }

        int[] array = map.values().stream().mapToInt(x -> x).sorted().toArray();

        int startIdx = 0;
        int endIdx = 0;

        if (array[0] == 1) {

            startIdx = 1;
            endIdx = array.length -1;
        } else if (array[array.length - 1] == array[array.length - 2] + 1) {
            startIdx = 0;
            endIdx = array.length -2;
        } else {
            startIdx = 0;
            endIdx = array.length -1;
        }

        for (int i = startIdx; i < endIdx; i++) {
            if (array[i] != array[i + 1]) {
                return "NO";
            }
        }
        return "YES";

    }
}
