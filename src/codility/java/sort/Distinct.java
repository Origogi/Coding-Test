package codility.java.sort;

import java.util.HashSet;

public class Distinct {
    public int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();

        for (int a : A) {
            set.add(a);
        }
        return set.size();
    }
}
