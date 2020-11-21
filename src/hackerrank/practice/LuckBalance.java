package hackerrank.practice;

import java.util.Arrays;
import java.util.Comparator;

public class LuckBalance {


    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {

        Arrays.sort(contests, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });

        int ans = 0;
        for (int[] contest : contests) {
            if (contest[1] == 1) {
                if (k > 0) {
                    k--;
                    ans += contest[0];
                } else {
                    ans -= contest[0];
                }
            }
            else {
                ans += contest[0];
            }

        }
        return ans;

    }

}
