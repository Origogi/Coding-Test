package hackerrank.practice;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();
        int left =0, right=0;

        for (int i = 0; i<n;i++) {
            left += arr.get(i).get(i);
            right += arr.get(i).get(n -1 - i);
        }

        return Math.abs(left - right);

    }
}
