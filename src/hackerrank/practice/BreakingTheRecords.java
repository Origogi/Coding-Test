package hackerrank.practice;

public class BreakingTheRecords {
    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {

        int max = scores[0];
        int low = scores[0];

        int maxCount = 0;
        int lowCount = 0;

        for (int i = 1;i< scores.length;i++) {
            if (max < scores[i]) {
                maxCount++;
                max = scores[i];
            } else if (low > scores[i]) {
                lowCount++;
                low = scores[i];
            }
        }

        return new int[]{maxCount, lowCount};
    }

}
