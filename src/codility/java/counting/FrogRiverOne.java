package codility.java.counting;

import java.util.HashSet;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> set = new HashSet<>();

        int ans = -1;

        for (int i = 0; i < A.length; i++) {
            int a = A[i];
            if (a <= X) {
                set.add(a);
            }

            if (set.size() == X) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}
