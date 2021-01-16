package hackerrank.practice;

import java.util.HashSet;
import java.util.Set;

public class AbsolutePermutation {
    // Complete the absolutePermutation function below.
    static int[] absolutePermutation(int n, int k) {

        int[] ans = new int[n];

        Set<Integer> set = new HashSet<>();

        int[] mul = new int[] {-1, 1};
        for (int i = 0;i < ans.length;i++) {
            int target = 0;

            for (int m : mul) {
                int temp = i + 1 + (k * m);

                if (temp > 0 && temp <=n && !set.contains(temp)) {
                    target = temp;
                    break;
                }
            }

            if (target > 0) {
                set.add(target);
                ans[i] = target;
            } else {
                return new int[] {-1};
            }

        }

        return ans;

    }
}
