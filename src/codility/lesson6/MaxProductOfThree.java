package codility.lesson6;

import java.util.Arrays;

public class MaxProductOfThree {

    public int solution(int[] A) {

        Arrays.sort(A);

        int N = A.length-1;
        int valueA = A[N-2] * A[N-1] *  A[N];
        int valueB =  A[0] *  A[1] *  A[N];

        return valueA > valueB ? valueA : valueB;

    }

    public int solution1(int[] A) {
        Arrays.sort(A);

        int end = A.length - 1;

        return Math.max((A[0]* A[1] * A[end]), (A[end -2] * A[end -1] * A[end]));
    }
}
