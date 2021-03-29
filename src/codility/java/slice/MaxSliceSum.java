package codility.java.slice;

public class MaxSliceSum {

    public int solution(int[] A) {
        int maxSum = A[0];
        int currentSum = A[0];

        for (int i = 1;i< A.length;i++) {
            currentSum += A[i];
            currentSum = Math.max(A[i], currentSum);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
