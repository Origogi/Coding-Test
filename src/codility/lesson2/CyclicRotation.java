package codility.lesson2;

public class CyclicRotation {

    public static void main(String[] args) {

    }

    public int[] solution(int[] A, int K) {
        if (A.length == 0 || K % A.length == 0) {
            return A;
        }

        K = K % A.length;

        int[] temp = new int[A.length];

        K = A.length - K;

        for (int i = K;i<A.length;i++) {
            temp[i-K] = A[i];
        }

        for (int i = 0;i<K;i++) {
            temp[A.length - K + i] = A[i];
        }
        return temp;
    }

    public int[] solution2(int[] A, int K) {

        int[] result = new int[A.length];

        for (int i = 0;i < A.length;i++) {
            result[(i + K) % A.length] = A[i];
        }
        return result;
    }
}
