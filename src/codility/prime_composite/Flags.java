package codility.prime_composite;

public class Flags {

    public static void main(String[] args) {
        new Flags().solution(new int[]{1,5,3,4,3,4,1,2,3,4,6,2});
    }
    public int solution(int[] A) {
        boolean[] peaks = new boolean[A.length];

        int minFlag = 0;
        int maxFlag = 0;
        for (int i = 1;i<A.length-1;i++) {
            if (A[i] > A[i-1] && A[i] > A[i +1] ) {
                peaks[i] = true;
                minFlag = 1;
                maxFlag++;
            }
        }

        int ans = minFlag;

        while (minFlag <= maxFlag) {
            int i = 0;
            int targetFlag = (minFlag + maxFlag) /2;
            int remainFlag = targetFlag;
            while (i < A.length && remainFlag > 0) {
                if (peaks[i]) {
                    remainFlag--;
                    i += targetFlag;
                } else {
                    i++;
                }
            }

            if (remainFlag == 0) {
                ans = targetFlag;
                minFlag = targetFlag +1;
            } else {
                maxFlag = targetFlag -1;
            }
        }
        return ans;

    }
}
