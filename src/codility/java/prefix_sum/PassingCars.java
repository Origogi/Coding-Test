package codility.java.prefix_sum;

public class PassingCars {
    public int solution(int[] A) {

        int westCar =0;
        int ans = 0;
        for (int i = A.length - 1; i >= 0; i--) {

            if (A[i] == 1) {
                westCar++;
            }
            else {
                ans += westCar;
                if (ans > 1_000_000_000) {
                    return -1;
                }
            }
        }

        return ans;
    }

}
