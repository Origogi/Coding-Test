package hackerrank.practice;

import java.util.Arrays;

public class MiniMaxSum {
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);

        long sum = 0;

        for (int a : arr) {
            sum += a;
        }

        System.out.println((sum - arr[arr.length-1]) + " " + (sum - arr[0]));
    }
}
