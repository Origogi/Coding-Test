package codility_temp.lesson3;

public class TapeEquilibrium {

    public int solution(int[] A) {
        double left = 0;
        double right = 0;
        double minDiff;

        for (int i = 1; i < A.length; i++) {
            right += A[i];
        }
        left = A[0];

        minDiff = Math.abs(left - right);

        for (int i = 1; i < A.length - 1; i++) {
            left += A[i];
            right -= A[i];

            double diff = Math.abs(left - right);

            minDiff = Math.min(diff, minDiff);
        }

        return (int) minDiff;
    }

    public int solution1(int[] A) {
        double left = 0, right = 0;

        for (int a : A) {
            right += a;
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            left += A[i];
            right -= A[i];
            int diff = (int) Math.abs(left - right);
            result = Math.min(diff, result);
        }
        return result;
    }
}
