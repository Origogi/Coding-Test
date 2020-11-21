package hackerrank.practice;

import java.util.Arrays;

public class MaxMin {

    // Complete the maxMin function below.
    static int maxMin(int k, int[] arr) {

        Arrays.sort(arr);
        int ans = Integer.MAX_VALUE;

        for (int i = 0;i<arr.length - k + 1;i++) {
            int max = arr[i + k -1];
            int min = arr[i];
            ans = Math.min(max - min, ans);
        }

        return ans;

    }

}
