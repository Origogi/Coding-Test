package codility.lesson5;

public class PassingCars {

    public int solution(int[] A) {
        int westCars = 0;
        int ans = 0;

        for (int i = A.length-1;i>=0;i--) {
            if (A[i] == 0 ) {
                ans += westCars;

                if (ans > 1_000_000_000) {
                    return -1;
                }
            }
            else {
                westCars++;
            }
        }
        return ans;

    }

    public int solution1(int[] A) {
        int westCar =0;

        for (int a : A) {
            if (a == 1) {
                westCar++;
            }
        }

        int result = 0;
        for (int a : A) {
            if (a == 0) {
                result += westCar;

                if (result > 1000000000) {
                    return -1;
                }
            }
            else {
                westCar--;
            }
        }

        return result;
    }
}
