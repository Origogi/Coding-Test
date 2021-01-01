package codility_temp.lesson5;

public class CountDiv {

    public int solution(int A, int B, int K) {

        if (B == 0) {
            return 1;
        }

        int ans = B / K;

        if (A == 0) {
            return ans + 1;
        }

        ans -= A / K;
        if (A % K == 0) {
            ans++;
        }

        return ans;

    }

    public int solution1(int A, int B, int K) {
        if (A == 0) {
            return (B / K) + 1;
        }
        else {
            return (B/K) - ((A-1)/K);
        }

    }
}
