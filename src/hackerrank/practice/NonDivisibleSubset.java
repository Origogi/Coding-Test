package hackerrank.practice;

import java.util.List;

public class NonDivisibleSubset {
    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here

        int[] remain = new int[k];

        for (int a : s) {
            remain[a % k]++;
        }
        int ans = 0;

        if (remain[0] > 0) {
            ans++;
        }

        for (int i = 1;i< (k /2) + 1;i++) {
            if (i != k - i) {
                ans += Math.max(remain[i], remain[k-i]);
            } else {
                if (remain[i] > 0) {
                    ans++;
                }
            }
        }
        return ans;

    }
}
