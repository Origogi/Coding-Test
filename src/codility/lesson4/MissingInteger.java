package codility.lesson4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

    public int solution(int[] A) {
        int minPositive = 1;

        Arrays.sort(A);

        for (int a : A) {
            if (minPositive == a) {
                minPositive++;
            }
        }

        return minPositive;
    }

    public int solution1(int[] A) {
        int maxValue = Integer.MIN_VALUE;

        Set<Integer> set = new HashSet<Integer>();
        for (int a : A) {
            set.add(a);
            maxValue = Math.max(a, maxValue);
        }

        if (maxValue <0) {
            return 1;
        }

        for (int i =1 ;i<= maxValue;i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return maxValue + 1;

    }
}
