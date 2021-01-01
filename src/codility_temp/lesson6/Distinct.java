package codility_temp.lesson6;

import java.util.*;

public class Distinct {

    public static void main(String[] args) {
        int[] A = {2, 1, 1, 2, 3, 1};

        System.out.println(new Distinct().solution(A));
    }

    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();

        for (int a : A) {
            set.add(a);
        }

        return set.size();
    }

    public int solution1(int[] A) {


        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            set.add(a);

        }
        return set.size();
    }
}
