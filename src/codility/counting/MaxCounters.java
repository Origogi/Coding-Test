package codility.counting;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int base = 0;
        int maxValue = 0;

        int[] ans = new int[N];

        for (int a : A) {
            if (a == N +1) {
                base = maxValue;
                continue;
            }

            if (ans[a -1] >= base) {
                ans[a-1]++;
            } else {
                ans[a-1] = base + 1;
            }

            maxValue = Math.max(maxValue, ans[a-1]);
        }

        for (int i = 0;i<ans.length;i++) {
            if (ans[i] < base) {
                ans[i] = base;
            }
        }

        return ans;

    }

}
