package hackerrank.practice;

import java.util.HashSet;
import java.util.Set;

public class BeautifulTriplets {
    // Complete the beautifulTriplets function below.
    static int beautifulTriplets(int d, int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int a : arr) {
            set.add(a);
        }
        int ans = 0;
        for (int a : arr) {
            int b = a + d;
            int c = b + d;

            if (set.contains(b) && set.contains(c)) {
                ans++;
            }
        }

        return ans;

    }
}
