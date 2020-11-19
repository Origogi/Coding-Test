package codility.lesson10;

public class MinPerimeterRectangle {

    public int solution(int N) {
        double i = 0;
        int ans = Integer.MAX_VALUE;

        while (i*i <= N) {
            if (N%i ==0) {
                int A = (int) (N/i);
                int B = N/A;

                ans = Math.min(2 * (A + B), ans);
            }
            i++;

        }

        return ans;

    }

    public int solution2(int N) {

        int i = 1;
        int result = Integer.MAX_VALUE;
        while (i <= Math.sqrt(N)) {
            if (N % i == 0) {
                int A = i;
                int B = N/i;
                result = Math.min(result,2*(A+B));
            }
            i++;
        }
        return  result;
    }
}
