package hackerrank.practice;

import java.util.Arrays;

public class MarkAndToys {

    public static void main(String[] args) {

    }

    static int maximumToys(int[] prices, int k) {

        Arrays.sort(prices);

        int sum = 0;
        int count = 0;

        for (int price : prices) {
            if (sum + price <=k) {
                sum += price;
                count++;
            }
            else {
                break;
            }
        }
        return count;
    }

}
