package codility.java.timecomplexity;

public class PermMissingElem {
    public int solution(int[] A) {
        double N = A.length +1;

        double sum = (N * (N+1)) /2;

        for (int a : A) {
            sum -= a;
        }
        return (int)sum;
    }
}
