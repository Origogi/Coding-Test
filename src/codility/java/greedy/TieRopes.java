package codility.java.greedy;

public class TieRopes {

    public int solution(int K, int[] A) {
        int sum = 0;
        int ans = 0;
        for (int a: A) {
            sum += a;
            if (sum >=K) {
                ans++;
                sum = 0;
            }
        }


        return ans;
    }
}
