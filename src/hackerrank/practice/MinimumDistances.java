package hackerrank.practice;

public class MinimumDistances {

    static int minimumDistances(int[] a) {

        int ans = -1;

        int N = a.length;
        for (int i = 0;i<N;i++) {
            for (int j = i + 1;j<N;j++) {
                if (a[i] == a[j]) {
                    if (ans == -1) {
                        ans = j - i;
                    } else {
                        ans = Math.min(ans, j - i);
                    }
                    break;
                }

            }
        }
        return ans;
    }

}
