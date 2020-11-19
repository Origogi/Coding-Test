package codility.lesson3;

import java.util.HashSet;
import java.util.Set;

public class PermMissingElem {

    public int solution(int[] A) {
        double N = A.length +1;

        double sumOfN = (N * (N+1))/2;
        for (int a : A) {
            sumOfN -=a;
        }

        return (int)sumOfN;
    }

    public int solution1(int[] A) {
        Set<Integer> set = new HashSet<>();

        for (int a : A) {
            set.add(a);
        }
        int N = A.length + 1;
        for (int i = 1;i<N;i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return N;
    }
}
