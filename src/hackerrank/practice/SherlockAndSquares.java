package hackerrank.practice;

public class SherlockAndSquares {
    // Complete the squares function below.
    static int squares(int a, int b) {
        int i = 1;
        int ans = 0;
        while (i * i <=b) {
            if (i * i >= a) {
                ans++;
            }
            i++;
        }
        return ans;

    }
}
