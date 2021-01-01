package codility_temp.lesson16;

public class MaxNonoverlappingSegments {

    public int solution(int[] A, int[] B) {
        if (A.length == 0) {
            return 0;
        }
        int end = B[0];
        int count = 1;

        for (int i = 1; i < A.length; i++) {
            if (end < A[i]) {
                end = B[i];
                count++;
            }
        }
        return count;

    }

    public int solution1(int[] A, int[] B) {
        int N = A.length;
        if (N == 0) {
            return 0;
        }

        int currentEnd = B[0];
        int result = 1;

        for (int i = 0; i < N; i++) {
            if (A[i] > currentEnd) {
                result++;
                currentEnd = B[i];
            }
        }

        return result;
    }
}
