package hackerrank.practice;

public class FairRations {
    // Complete the fairRations function below.
    static int fairRations(int[] B) {

        int ans = 0;
        for (int i = 0;i<B.length-1;i++) {
            if (B[i] % 2 == 1) {
                B[i]++;
                B[i+1]++;
                ans +=2;
            }
        }

        if (B[B.length -1] % 2 == 1) {
            return -1;
        }

        return ans;
    }

}
