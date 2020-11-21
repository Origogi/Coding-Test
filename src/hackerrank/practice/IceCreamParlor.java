package hackerrank.practice;

import java.util.HashMap;
import java.util.Map;

public class IceCreamParlor {

    public static void main(String[] args) {
        whatFlavors(new int[] {1 ,4 ,5 ,3 ,2}, 4);
    }

    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int c : cost) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int idxA =0, idxB =0;

        for (int i = 0;i< cost.length;i++) {

            int key = cost[i];

            // Remove key
            int count = map.get(key);
            if (count == 1) {
                map.remove(key);
            } else {
                map.put(key, count - 1);
            }
            // Check
            if (map.containsKey(money - key)) {
                idxA = i;
                break;
            }

            // Restore key
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (int i = 0;i<cost.length;i++) {
            if (i == idxA) {
                continue;
            }

            if (money == cost[idxA] + cost[i]) {
                idxB = i;
                break;
            }
        }

        System.out.println(String.format("%d %d", idxA + 1,idxB + 1));

    }
}
