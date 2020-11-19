package codility.lesson6;

import java.util.Arrays;

public class Triangle {

    public int solution(int[] A) {
        Arrays.sort(A);

        for (int i = 2;i<A.length;i++) {
            if (A[i-2] - A[i-1] -A[i] >= 0) {
                continue;
            }

            if (A[i-1] - A[i-2] -A[i] >= 0) {
                continue;
            }

            if (A[i] - A[i-1] -A[i-2] >= 0) {
                continue;
            }
            return 1;
        }
        return 0;
    }


    public int solution1(int[] A) {
        Arrays.sort(A);

        for (int i = 2; i<A.length;i++) {
            if (A[i] - A[i-1] - A[i -2] < 0) {
                return 1;
            }
        }
        return 0;
    }
}
