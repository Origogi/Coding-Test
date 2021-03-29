package codility.java.leader;

import java.util.HashMap;
import java.util.Map;

public class Dominator {

    public int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();

        double max = 0;

        for (int i =0;i<A.length;i++) {
            int a = A[i];
            int count = map.getOrDefault(a, 0) + 1;
            map.put(a, count);
            max = Math.max(count, max);
            if (max > A.length / 2D) {
                return i;
            }
        }

        return -1;

    }
}
