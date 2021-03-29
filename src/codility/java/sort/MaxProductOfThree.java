package codility.java.sort;

import java.util.Arrays;

public class MaxProductOfThree {
    public int solution(int[] A) {
        Arrays.sort(A);
        int max = A[0] * A[1] * A[A.length-1];
        return Math.max(max, A[A.length-1] * A[A.length-2] * A[A.length-3]);
    }
}
