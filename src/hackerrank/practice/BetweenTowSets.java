package hackerrank.practice;

import java.util.List;

public class BetweenTowSets {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        int lcmInt = a.stream().reduce((i,j) -> lcm(i,j)).get();
        int gcdInt = b.stream().reduce((i,j) -> gcd(i,j)).get();

        int target = lcmInt;
        int ans = 0;
        while(target <= gcdInt) {
            if (gcdInt % target == 0) {
                ans++;
            }
            target += lcmInt;
        }
        return ans;
    }

    static int gcd(int a ,int b) {

        if (a < b) {
            int temp = b;
            b = a;
            a = temp;
        }

        while(b > 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }

    static int lcm (int a, int b) {
        return (a * b)/ gcd(a,b);
    }
}
