package codility.slice;

public class MaxProfit {

    public static void main(String[] args) {
        new MaxProfit().solution(new int[]{});
    }

    public int solution(int[] A) {
        int[] diff = new int[A.length];

        for (int i = 0;i <A.length-1;i++) {
            diff[i] = A[i +1] - A[i];
        }

        int maxProfit =0;

        int currentProfit = 0;
        for (int d : diff) {
            currentProfit += d;
            currentProfit = Math.max(currentProfit, 0);
            maxProfit = Math.max(maxProfit, currentProfit);
        }

        return maxProfit;

    }

}
