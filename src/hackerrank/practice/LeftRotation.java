package hackerrank.practice;

import java.util.Arrays;


public class LeftRotation {

    public static void main(String[] args) {
        rotLeft(new int[]{1,2,3,4,5}, 4);
    }

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

        int mod  = d % a.length;

        int[] left =  Arrays.copyOfRange(a, mod, a.length);
        int[] right =  Arrays.copyOfRange(a, 0, mod);

        int i = 0;

        int[] result = new int[a.length];

        for (; i < left.length;i++) {
            result[i] = left[i];
        }

        for (;i < a.length;i++) {
            result[i] = right[i - left.length];
        }

        return result;
    }

}
