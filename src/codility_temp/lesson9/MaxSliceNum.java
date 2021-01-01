package codility_temp.lesson9;

public class MaxSliceNum {

    public static void main(String[] args) {
        MaxSliceNum maxSliceNum = new MaxSliceNum();
        int[] A = {1,2};
        int ans = maxSliceNum.solution1(A);
        System.out.println(ans);
    }

    public int solution(int[] A) {
        double endValue = A[0];
        double maxSlice = A[0];


        for (int i = 1;i<A.length;i++) {

            endValue = Math.max(endValue + A[i] ,A[i]);
            maxSlice = Math.max(endValue, maxSlice);
        }
        return (int)maxSlice;

    }

    public int solution1(int[] A) {
        int currentSum = A[0];
        int maxSum = currentSum;

        for (int i = 1;i<A.length;i++) {
            currentSum = Math.max(A[i], currentSum + A[i]);
            maxSum = Math.max(currentSum, maxSum);

        }

        return Math.max(currentSum, maxSum);

    }
}
