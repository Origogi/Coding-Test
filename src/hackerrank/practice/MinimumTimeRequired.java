package hackerrank.practice;

import java.util.Arrays;

public class MinimumTimeRequired {

    public static void main(String[] args) {
        minTime(new long[]{2, 3}, 5);
    }

    // Complete the minTime function below.
    static long minTime(long[] machines, long goal) {
        Arrays.sort(machines);

        long maxDay = machines[machines.length-1] * goal;
        long minDay = 1;

        while (minDay < maxDay) {
            long midDay = (maxDay + minDay) /2;

            long tempGoal = 0;

            for (int i = 0;i < machines.length;i++) {
                tempGoal += Math.floor(midDay/machines[i]);
            }

            if (tempGoal >= goal) {
                maxDay = midDay;
            } else {
                minDay = midDay + 1;
            }

        }
        return minDay;

    }
}
