package codility.lesson9;

public class MaxDoubleSliceSum {


    public static void main(String[] args) {
        MaxDoubleSliceSum maxDoubleSliceSum = new MaxDoubleSliceSum();
        int[] A = {3, 2, 6, -1, 4, 5, -1, 2};
        int ans = maxDoubleSliceSum.solution1(A);
        System.out.println(ans);
    }

    public int solution(int[] A) {

        int[] maxLeft = new int[A.length];
        int[] maxRight = new int[A.length];

        for (int i = 1; i < A.length; i++) {
            maxLeft[i] = Math.max(0, maxLeft[i - 1] + A[i]);
            System.out.println(i + "/" + maxLeft[i]);
        }

        for (int i = A.length - 2; i >= 0; i--) {
            maxRight[i] = Math.max(0, maxRight[i + 1] + A[i]);
        }
        int maxSlice = 0;
        for (int i = 1; i < A.length - 1; i++) {
            maxSlice = Math.max(maxLeft[i - 1] + maxRight[i + 1], maxSlice);
        }
        return maxSlice;
    }

    public int solution1(int[] A) {
        int[] leftMaxSum = new int[A.length];
        int[] rightMaxSum = new int[A.length];

        for (int i = 1; i < leftMaxSum.length; i++) {
            leftMaxSum[i] = Math.max(0, leftMaxSum[i - 1] + A[i]);
        }

        for (int i = rightMaxSum.length - 2; i >=0; i--) {
            rightMaxSum[i] = Math.max(0, rightMaxSum[i +1] + A[i]);
        }

        int maxSlice = Integer.MIN_VALUE;

        for (int i = 1; i< A.length-1;i++) {
            maxSlice = Math.max(maxSlice,leftMaxSum[i-1] + rightMaxSum[i+1]);
        }
        return maxSlice;

    }
}
