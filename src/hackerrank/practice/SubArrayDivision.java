package hackerrank.practice;

import java.util.List;

public class SubArrayDivision {
    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {

        int sum = 0;

        for (int i = 0;i<m;i++) {
            sum += s.get(i);
        }
        int ans = 0;
        if (sum == d) {
            ans++;
        }


        for (int i = 0;i<s.size()-m;i++) {
            sum = sum - s.get(i) + s.get(i + m);

            if (sum == d) {
                ans++;
            }
        }
        return ans;

    }
}
