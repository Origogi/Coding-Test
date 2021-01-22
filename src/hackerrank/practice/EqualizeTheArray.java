package hackerrank.practice;

import java.util.HashMap;
import java.util.Map;

public class EqualizeTheArray {
    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {

        Map<Integer, Integer> map = new HashMap();

        int maxCount = 0;

        for (int a :arr) {
            int count = map.getOrDefault(a, 0) + 1;
            map.put(a, count);
            maxCount = Math.max(count , maxCount);
        }

        return arr.length - maxCount;
    }
}
