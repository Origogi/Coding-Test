package codility_temp.lesson3;

public class FrogJmp {

    public static void main(String[] args) {

    }

    public int solution(int X, int Y, int D) {
        Y -=X;

        int ans = Y/D;

        if (Y%D != 0) {
            ans++;
        }
        return ans;
    }

    public int solution1(int X, int Y, int D) {
        Y -=X;

        int result = Y / D;
        if (Y % D != 0) {
            result++;
        }
        return result;
    }
}
