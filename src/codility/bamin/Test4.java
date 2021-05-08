package codility.bamin;

import java.util.Arrays;



public class Test4 {

    public static void main(String[] args) {
        int result = new Test4().solution(new int[]{3}, new int[]{1,1,2,3});
        System.out.println(result);
    }

    int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n; k++) {
            if (i < m - 1 && B[i] < A[k])
                i += 1;
            if (A[k] == B[i])
                return A[k];
        }
        return -1;
    }
}
