package hackerrank.practice;

public class FindDigits {
    // Complete the findDigits function below.
    static int findDigits(int n) {

        final int N = n;
        int ans = 0;
        while (n > 0) {
            int d = n % 10;
            n = n /10;

            if (d != 0 && N %d == 0) {
                ans++;
            }
        }
        return ans;
    }
}
