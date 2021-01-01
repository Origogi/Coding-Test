package codility_temp.lesson5;

public class MinAvgTwoSlice {

    public static void main(String[] args) {
        int[] A = {4, 2, 2, 5, 1, 5, 8};

        int ans = new MinAvgTwoSlice().solution1(A);
        System.out.println(ans);
    }

    public int solution(int[] A) {
        int ans = 0;

        double minAvg = (A[0] + A[1]) / 2.0;

        for (int i = 2; i < A.length; i++) {
            double avg = (A[i - 2] + A[i - 1] + A[i]) / 3.0D;

            if (avg < minAvg) {
                ans = i - 2;
                minAvg = avg;
            }

            avg = (A[i - 1] + A[i]) / 2.0D;

            if (avg < minAvg) {
                ans = i - 1;
                minAvg = avg;
            }

        }
        return ans;
    }

    public int solution1(int[] A) {
        int result = 0;

        double minAvg = getAvg(A[0], A[1]);

        for (int i = 2; i < A.length; i++) {
            double avg = getAvg(A[i-2], A[i-1], A[i]);
            if (minAvg > avg) {
                minAvg = avg;
                result = i -2;
            }
            avg = getAvg(A[i-1], A[i]);
            if (minAvg > avg) {
                minAvg = avg;
                result = i -1;
            }
        }
        return result;
    }

    double getAvg(int... args) {
        double sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum/args.length;
    }
}
