package hackerrank.practice;

import java.util.HashSet;
import java.util.Set;

public class Pairs {

    // Complete the pairs function below.
    static int pairs(int k, int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int v : arr) {
            set.add(v);
        }

        int ans = 0;
        for (int v : arr) {
            if (set.contains(v + k)) {
                ans ++;
            }
        }
        return ans;
    }
}
