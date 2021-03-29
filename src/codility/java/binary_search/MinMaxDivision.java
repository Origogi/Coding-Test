package codility.java.binary_search;

public class MinMaxDivision {

    public static void main(String[] args) {
        new MinMaxDivision().solution(3,5,new int[]{1,2});
    }

    public int solution(int K, int M, int[] A) {

        int max = 0;
        int min = 0;

        for (int i = 0; i < A.length; i++) {//get the sum as max, and the largest number as min
            max += A[i];
            min = Math.max(min, A[i]);
        }

        int ans = max;

        while (min <= max) {
            int target = (max + min) / 2;

            int remain = K;

            double sum = 0;

            for (int a : A) {
                if (sum + a > target) {
                    remain--;
                    sum = a;
                } else {
                    sum += a;
                }
            }

            if (remain < 1) {
                min = target + 1;
            } else {
                ans = target;
                max = target-1;
            }
        }


        return ans;
    }

}
