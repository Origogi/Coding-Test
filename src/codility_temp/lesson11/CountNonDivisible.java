package codility_temp.lesson11;

import java.util.Arrays;

public class CountNonDivisible {

    public static void main(String[] args) {
        int[] A = {3, 1, 2, 3, 6};
        new CountNonDivisible().solution(A);
    }

    public int[] solution(int[] A) {
        int N = 0;

        N = Arrays.stream(A).reduce( (a,b) -> a>b ? a:b).getAsInt();

        int[] temp = new int[N +1];

        for (int i = 0;i<A.length;i++) {
            int k = A[i];

            while (k<=N) {
                temp[k]++;
                k += A[i];
            }
        }

        int[] ans = new int[A.length];

        for (int i = 0;i<A.length;i++) {
            ans[i] = A.length  - temp[A[i]];
        }

        return ans;
    }
}
