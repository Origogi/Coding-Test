package hackerrank.practice;

public class SurfaceArea {
    // Complete the surfaceArea function below.
    static int surfaceArea(int[][] A) {

        int M = A.length;
        int N = A[0].length;

        int ans = (M * N) * 2;

        for (int i=0;i<M;i++) {
            ans += A[i][0];
            for (int j = 1;j<N;j++) {
                int diff = A[i][j] - A[i][j-1];
                if (diff > 0) {
                    ans += diff;
                }
            }

            ans += A[i][N-1];

            for (int j = N -1;j >0;j--) {
                int diff = A[i][j -1] - A[i][j];
                if (diff > 0) {
                    ans += diff;
                }
            }
        }

        for (int i = 0;i<N;i++) {
            ans += A[0][i];

            for (int j = 1;j<M ;j++) {
                int diff = A[j][i] - A[j -1][i];
                if (diff > 0) {
                    ans += diff;
                }
            }

            ans += A[M -1][i];

            for (int j = M -1; j > 0;j--) {
                int diff = A[j-1][i] - A[j][i];
                if (diff > 0) {
                    ans+= diff;
                }
            }
        }

        return ans;
    }

}
