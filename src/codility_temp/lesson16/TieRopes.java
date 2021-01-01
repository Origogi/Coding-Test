package codility_temp.lesson16;

public class TieRopes {

    public int solution(int K, int[] A) {
        int sum =0;
        int count = 0;

        for (int a : A) {
            sum += a;

            if (sum >= K) {
                sum = 0;
                count++;
            }
        }

        return count;
    }

    public int solution1(int K, int[] A) {

        int result = 0;

        int sum = 0;
        for (int a : A) {
            sum += a;
            if (sum >=K) {
                result++;
                sum = 0;
            }
        }
        return result;

    }
}
