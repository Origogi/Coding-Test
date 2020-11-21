package hackerrank.practice;

import java.util.Arrays;


public class GreedyFlorist {

    public static void main(String[] args) {
        getMinimumCost(2, new int[]{2,5,6});
    }

    // Complete the getMinimumCost function below.
    static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c);

        int customer = 1;
        int ans = 0;
        int i = 0;
        int count = 0;

        while (i < c.length) {
            ans += c[c.length - 1 -i] * customer;
            i++;
            count++;

            if (k == count) {
                customer++;
                count = 0;
            }
        }

        return ans;
    }
}
