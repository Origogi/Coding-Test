package hackerrank.practice;

public class SaveThePrisoner {
    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int n, int m, int s) {

        int mod = m % n;
        mod--;

        int ans = s + mod;

        if (ans > n) {
            ans -= n;
        } else if (ans == 0) {
            ans = n;
        }
        return ans;


    }
}
