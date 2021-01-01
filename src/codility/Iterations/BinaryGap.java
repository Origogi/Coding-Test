package codility.Iterations;

public class BinaryGap {

    public static void main(String[] args) {
        new BinaryGap().solution(1041);
    }

    public int solution(int N) {
        int ans = 0;
        int gap = 0;
        boolean flag = false;
        while (N > 0) {
            int mod = N %2;
            if (flag) {
                if (mod == 1) {
                    ans = Math.max(ans, gap);
                    gap = 0;
                } else {
                    gap++;
                }
            } else {
                if (mod == 1) {
                    flag = true;
                }
            }
            N=  N / 2;
        }
        return ans;
    }
}
