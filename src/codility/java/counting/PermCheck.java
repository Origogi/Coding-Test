package codility.java.counting;

import java.util.HashSet;

public class PermCheck {
    public int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int a : A) {
            set.add(a);
        }

        for (int i = 1;i<=A.length;i++) {
            if (!set.contains(i)) {
                return 0;
            }
        }
        return 1;
    }
}
