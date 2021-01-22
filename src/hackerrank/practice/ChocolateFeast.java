package hackerrank.practice;

public class ChocolateFeast {

    // Complete the chocolateFeast function below.
    static int chocolateFeast(int n, int c, int m) {
        int remainChoco = n /c;

        int ans = remainChoco;

        while (remainChoco >= m) {
            int div = remainChoco / m;
            int mod = remainChoco % m;
            remainChoco = div + mod;
            ans += div;
        }
        return ans;
    }
}
