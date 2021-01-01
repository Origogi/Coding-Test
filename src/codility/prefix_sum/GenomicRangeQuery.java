package codility.prefix_sum;

import java.util.HashMap;
import java.util.Map;

public class GenomicRangeQuery {

    public static void main(String[] args) {
        new GenomicRangeQuery().solution("CAGCCTA", new int[]{},new int[]{});
    }

    public int[] solution(String S, int[] P, int[] Q) {

        // A, C, G, T
        int[][] prefixSum = new int[4][S.length()];

        Map<Character, Integer> map = new HashMap<>();

        map.put('A', 0);
        map.put('C', 1);
        map.put('G', 2);
        map.put('T', 3);

        char[] chars = S.toCharArray();

        prefixSum[map.get(chars[0])][0]++;

        for (int i = 1; i < S.length(); i++) {

            for (int j = 0;j<4;j++) {
                prefixSum[j][i] = prefixSum[j][i -1];
            }
            prefixSum[map.get(chars[i])][i]++;
        }

        int[] ans = new int[P.length];

        for (int i = 0; i < ans.length; i++) {
            int p = P[i];
            int q = Q[i];

            int[] result = new int[4];

            if (p == 0) {
                for (int j = 0; j < 4; j++) {
                    result[j] = prefixSum[j][q];
                }
            } else {
                for (int j = 0; j < 4; j++) {
                    result[j] = prefixSum[j][q] - prefixSum[j][p - 1];
                }
            }


            for (int j = 0; j < 4; j++) {
                if (result[j] > 0) {
                    ans[i] = j + 1;
                    break;
                }
            }
        }
        return ans;
    }
}
