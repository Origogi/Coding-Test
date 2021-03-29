package codility.java.slice;

public class MaxDoubleSliceSum {

    public static void main(String[] args) {
        new MaxDoubleSliceSum().solution(new int[]{3, 2, 6, -1, 4, 5, -1, 2});
    }

    public int solution(int[] A) {

        int[] leftSum = new int[A.length];
        int[] rightSum = new int[A.length];

        for (int i = 1;i<A.length-1;i++) {
            leftSum[i] = Math.max(0,leftSum[i-1] + A[i]);
        }

        for (int i = A.length -2;i>0;i--) {
            rightSum[i] = Math.max(0,rightSum [i+1] + A[i]);
        }

        int maxSlice = 0;

        for (int i = 1;i< A.length -1;i++) {
            maxSlice = Math.max(maxSlice, leftSum[i-1] + rightSum[i +1]);
        }

        return maxSlice;

    }
}
