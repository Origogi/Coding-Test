package codility.prime_composite;

import java.util.HashSet;
import java.util.Set;

public class MinPerimeterRectangle {
    public int solution(int N) {

        int ans = 0;

        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                ans = (i * 2) + (N / i) * 2;
            }
        }
        return ans;
    }
}
