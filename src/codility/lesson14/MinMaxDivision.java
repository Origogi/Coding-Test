package codility.lesson14;

public class MinMaxDivision {

    public static void main(String[] args) {
        int M =5;
        int K = 3;
        int[] A = {2,1,5,1,2,2,2};
        int ans = new MinMaxDivision().solution(K, 5,A);
        System.out.print(ans);
    }

    public int solution(int K, int M, int[] A) {
        int minSum = A[0];
        int maxSum = A[0];

        for (int i = 1;i<A.length;i++) {
            minSum = Math.max(minSum, A[i]);
            maxSum = maxSum + A[i];
        }

        int ans = maxSum;

        while (minSum<=maxSum) {
            int midSum = (maxSum + minSum)/2;

            boolean ok = isDivideBlock(midSum, K, A);

            if (ok) {
                ans = midSum;
                maxSum = midSum -1;
            }
            else {
                minSum = midSum +1;
            }
        }
        return ans;

    }

    private boolean isDivideBlock(int maxSum, int K, int[] A) {
        int currentSum = 0;
        int remainBlock = K;
        for (int a :A) {
            currentSum +=a;
            if (currentSum > maxSum) {
                currentSum = a;
                remainBlock--;
            }

            if (remainBlock == 0) {
                return false;
            }
        }

        return true;

    }
}
