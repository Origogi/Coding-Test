package programmers_temp.hash;

import java.util.HashMap;
import java.util.Map;

public class lesson3 {

    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();

        for (String[] cloth : clothes) {
            String key = cloth[1];
//            String value = cloth[0];

            int count = map.getOrDefault(key, 0);
            map.put(key, count + 1);
        }

        for (int count : map.values()) {
            answer *= (count + 1);
        }

        return answer -1 ;
    }
}
