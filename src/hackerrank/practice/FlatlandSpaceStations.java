package hackerrank.practice;

public class FlatlandSpaceStations {
    // Complete the flatlandSpaceStations function below.
    static int flatlandSpaceStations(int n, int[] c) {
        int ans = 0;
        for (int i = 0;i<n;i++) {
            int minDiff = Integer.MAX_VALUE;
            for (int pos : c) {
                minDiff = Math.min(minDiff, Math.abs(pos - i));
            }

            ans = Math.max(ans, minDiff);
        }
        return ans;

    }
}
