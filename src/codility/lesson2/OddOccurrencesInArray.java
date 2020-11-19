package codility.lesson2;

import java.util.HashSet;

public class OddOccurrencesInArray {

    public static void main(String[] args) {

    }

    public int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int a : A) {
            if (set.contains(a)) {
                set.remove(a);
            }
            else {
                set.add(a);
            }
        }
        return set.stream().findFirst().get();
    }

    public int solution2(int[] A) {
        int result = 0;
        for (int a : A) {
            result ^= a;
        }
        return result;

    }
}
