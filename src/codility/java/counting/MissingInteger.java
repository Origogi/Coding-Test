package codility.java.counting;

import java.util.HashSet;

public class MissingInteger {
    public int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();

        for (int a : A) {
            set.add(a);
        }
        int ans = -1;
        for (int i = 1; i<= A.length +1;i++) {
            if (!set.contains(i)) {
                ans = i;
                break;
            }
        }

        return ans;
    }

}
