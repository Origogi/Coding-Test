package hackerrank.practice;

public class UtopianTree {
    static int utopianTree(int n) {

        int current = 0;
        int ans = 1;

        while (current < n) {
            current++;

            if ( (current-1) % 2 ==0) {
                ans *= 2;
            } else {
                ans++;
            }

        }
        return ans;
    }
}
