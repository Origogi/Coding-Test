package codility_temp.lesson4;

import java.util.Arrays;

public class MaxCounters {

    public static void main(String[] args) {
        int N = 1;
        int[] A = {2, 1, 1, 1, 2, 1};

        System.out.println(Arrays.toString(new MaxCounters().solution(1, A))
        );
    }

    public int[] solution(int N, int[] A) {

        int baseValue = 0;
        int maxValue = 0;
        int[] ans = new int[N];

        for (int a : A) {
            if (a == N + 1) {
                baseValue = maxValue;
            } else {
                if (ans[a - 1] < baseValue) {
                    ans[a - 1] = baseValue;
                }
                ans[a - 1]++;

                if (maxValue < ans[a - 1]) {
                    maxValue = ans[a - 1];
                }
            }
        }

        for (int i = 0; i < ans.length; i++) {
            if (ans[i] < baseValue) {
                ans[i] = baseValue;
            }
        }

        return ans;
    }

    public int[] solution1(int N, int[] A) {
        int[] result = new int[N];
        int lowValue = 0;
        int maxValue = 0;

        for (int a : A) {
            if (a == N + 1) {
                lowValue = maxValue;
                continue;
            }

            if (result[a -1] < lowValue) {
                result[a-1] = lowValue;
            }

            result[a-1]++;

            maxValue = Math.max(maxValue, result[a-1]);
        }

        for (int i = 0;i<N;i++) {
            if (result[i] < lowValue) {
                result[i] = lowValue;
            }
        }
        return result;

    }
}