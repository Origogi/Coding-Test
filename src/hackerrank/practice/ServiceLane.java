package hackerrank.practice;

public class ServiceLane {
    // Complete the serviceLane function below.
    static int[] serviceLane(int[] width, int[][] cases) {
        int N = cases.length;
        int [] ans = new int[N];


        for (int i = 0;i<N;i++) {
            int min = Integer.MAX_VALUE;

            int start = cases[i][0];
            int end = cases[i][1];

            for (int j = start;j<=end;j++) {
                min = Math.min(min, width[j]);
            }
            ans[i] = min;
        }
        return ans;

    }
}
