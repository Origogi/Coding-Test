package codility.java.sort;

import java.util.Arrays;

public class Triangle {

    public int solution(int[] A) {
        Arrays.sort(A);

        for (int i = 2; i < A.length; i++) {
            long left = A[i- 2] + (long)A[i -1];
            long right =A[i];

            if (left > right) {
                return 1;
            }
        }
        return 0;
    }
}
