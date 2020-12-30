package programmers.binary_search;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {
        new Test1().solution(6, new int[]{7, 10});
    }

    public long solution(int n, int[] times) {

        Arrays.sort(times);
        long maxTime = (long)times[times.length-1]*n;
        long minTime = 1;

        long ans = Long.MAX_VALUE;

        long target = 0;
        while (minTime <= maxTime) {
            long count = 0;
            target = (maxTime + minTime) /2;
            for (int time : times) {
                count += (target / time);
            }

            if (count >= n) {
                ans = Math.min(target, ans);
                maxTime = target - 1;
            } else {
                minTime = target + 1;
            }
        }


        return target;
    }
}
