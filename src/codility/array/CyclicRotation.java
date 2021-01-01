package codility.array;



public class CyclicRotation {

    public int[] solution(int[] A, int K) {

        if (A.length == 0) {
            return A;
        }

        K %= A.length;

        int[] ans = new int[A.length];

        K = A.length -K;

        int j =0;
        for (int i = K ;i< A.length;i++) {
            ans[j] = A[i];
            j++;
        }

        for (int i = 0;i<K;i++) {
            ans[j] = A[i];
            j++;
        }

        return ans;
    }
}
