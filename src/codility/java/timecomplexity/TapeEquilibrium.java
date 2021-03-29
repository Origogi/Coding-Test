package codility.java.timecomplexity;

public class TapeEquilibrium {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int left = A[0];

        int right = 0;
        for (int i = 1; i < A.length; i++) {
            right += A[i];
        }

        int min = Math.abs(left - right);

        for (int i = 1; i < A.length - 1; i++) {
            left += A[i];
            right -= A[i];
            min = Math.min(min, Math.abs(left - right));
        }
        return min;
    }
}
