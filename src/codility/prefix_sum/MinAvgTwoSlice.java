package codility.prefix_sum;

public class MinAvgTwoSlice {

    public int solution(int[] A) {
        int minIdx;
        double minAvg = (A[0] + A[1]) / 2D;
        minIdx = 0;

        for (int i = 2; i < A.length; i++) {
            double avg = (A[i - 1] + A[i]) / 2D;

            if (avg < minAvg) {
                minAvg = avg;
                minIdx = i - 1;
            }

            avg = (A[i - 2] + A[i - 1] + A[i]) / 3D;

            if (avg < minAvg) {
                minAvg = avg;
                minIdx = i - 2;
            }

        }
        return minIdx;
    }
}
