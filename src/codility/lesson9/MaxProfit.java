package codility.lesson9;

public class MaxProfit {


    public static void main(String[] args) {
        MaxProfit maxPrice = new MaxProfit();

        int[] A = {23171, 21011, 21123, 21366, 21013, 21367};
        System.out.println(maxPrice.solution(A));
    }

    public int solution(int[] A) {

        if (A.length == 0) {
            return 0;
        }

        int maxEnd = A[0];
        int minStart = A[0];
        int maxCost = maxEnd - minStart;

        for (int a : A) {
            if (minStart > a) {
                minStart = a;
                maxEnd = a;
            }

            maxEnd = Math.max(a, maxEnd);
            maxCost = Math.max(maxCost, maxEnd - minStart);
        }

        return maxCost;
    }

    public int solution1(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        int minStart = A[0];
        int maxEnd = A[0];
        int maxProfit = maxEnd - minStart;

        for (int a : A) {
            if (minStart > a) {
                minStart = a;
                maxEnd = a;
                continue;
            }

            maxEnd = Math.max(a, maxEnd);
            maxProfit = Math.max(maxProfit , maxEnd - minStart);
        }

        return maxProfit;
    }
}
