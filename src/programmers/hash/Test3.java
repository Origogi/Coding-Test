package programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class Test3 {

    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();

        for (String[] cloth : clothes) {
            String key = cloth[1];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (int value : map.values()) {
            answer *= value +1;
        }

        return answer - 1;
    }
}
