package codility_temp.lesson10;

public class CountFactors {

    public static void main(String[] args) {
        int A = 9;

        CountFactors countFactors = new CountFactors();
        int result = countFactors.solution1(A);


        System.out.println(result);
    }

    public int solution(int N) {

        double i = 1;
        int ans = 0;

        while (i * i < N) {
            if (N % i == 0) {
                ans += 2;
            }
            i++;
        }

        if (N == i * i) {
            ans++;
        }
        return ans;
    }

    public int solution1(int N) {

        int i = 1;
        int result = 0;
        while (i< Math.sqrt(N)) {
            if (N%i == 0) {
                result +=2;
            }
            i++;
        }

        if (i *i == N) {
            result++;
        }
        return result;
    }
}
