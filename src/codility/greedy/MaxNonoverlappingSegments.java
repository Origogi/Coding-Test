package codility.greedy;

public class MaxNonoverlappingSegments {
    public int solution(int[] A, int[] B) {

        int currentEnd = -1;
        int seg =0;
        for (int i = 0;i<A.length;i++) {
            if (A[i] > currentEnd) {
                currentEnd = B[i];
                seg++;
            }
        }
        return seg;
    }

}
