package hackerrank.practice;

import java.util.List;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here

        int ans = 0;
        int max = 0;

        for (int candle : candles) {
            if (candle > max) {
                ans = 1;
                max = candle;
            } else if (candle == max) {
                ans++;
            }
        }

        return ans;
    }
}
