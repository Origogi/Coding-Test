package codility_temp.lesson4;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public static void main(String[] args) {

    }

    int solution(int X, int[] A) {
        double sum = ((double) X * ((double) X + 1)) / 2;

        boolean[] isLeaf = new boolean[X + 1];

        for (int i = 0; i < A.length; i++) {
            if (!isLeaf[A[i]]) {
                isLeaf[A[i]] = true;
                sum -= A[i];
            }

            if (sum == 0) {
                return i;
            }
        }
        return -1;
    }

    int solution1(int X, int[] A) {
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X) {
                set.add(A[i]);
            }

            if (set.size() == X) {
                return i;
            }
        }
        return -1;

    }
}
