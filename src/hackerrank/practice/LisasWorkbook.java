package hackerrank.practice;

public class LisasWorkbook {
    // Complete the workbook function below.
    static int workbook(int n, int k, int[] arr) {

        int index = 1;
        int end = k;
        int ans = 0;

        for (int remain : arr) {
            int start = 1;

            while (start <=remain) {
                end = start + k -1;
                if (end > remain) {
                    end = remain;
                }

                if (start <= index && index <= end) {
                    ans++;
                }
                start = end +1;
                index++;
            }
        }

        return ans;
    }
}
