package hackerrank.practice;

import java.util.*;

public class MinimumLoss {
    public static int minimumLoss(List<Long> price) {
        // Write your code here

        Map<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < price.size(); i++) {
            map.put(price.get(i), i);
        }

        Collections.sort(price);

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < price.size() - 1; i++) {
            if (map.get(price.get(i)) > map.get(price.get(i + 1))) {

                int diff = (int) (price.get(i + 1) - price.get(i));

                if (diff > 0 && diff < ans) {
                    ans = diff;
                }
            }
        }
        return ans;

    }
}
