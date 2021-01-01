package codility_temp.lesson4;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {

    public static void main(String[] args) {

    }

    public int solution(int[] A) {
        int N = A.length;
        double sumOfN = ((N +1) * N) /2;

        for (int a : A) {
            sumOfN -= a;
        }

        return sumOfN == 0 ? 1 :0;
    }

    public int solution1(int[] A) {
        Set<Integer> set = new HashSet<Integer>();
        for (int a : A) {
            set.add(a);
        }

        int N = A.length;

        for (int i = 1;i<=N;i++) {
            if (!set.contains(i)) {
                return 0;
            }
        }
        return 1;

    }
}
