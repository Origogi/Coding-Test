package hackerrank.practice;

import java.util.Arrays;

public class MinimumAbsoluteDifferenceInAnArray {

    // Complete the minimumAbsoluteDifference function below.
    static int minimumAbsoluteDifference(int[] arr) {

        int ans = Integer.MAX_VALUE;

        Arrays.sort(arr);

        for (int i = 0;i <arr.length-1;i++) {
            ans = Math.min(ans, Math.abs(arr[i] - arr[i+1]));
        }
        return ans;
    }
}
