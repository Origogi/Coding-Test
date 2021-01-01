package programmers.test;

import java.util.Arrays;

public class Test3 {

    public static void main(String[] args) {
        new Test3().solution(new int[]{2, 4, 5, 3, 2, 1, 4, 2, 5, 1}, 3);
    }

    public int solution(int[] stones, int k) {

        int maxValue = Arrays.stream(stones).max().getAsInt();

        boolean flag = true;

        while (flag) {
            int diff = 0;

            flag = false;

            for (int stone : stones) {
                if (maxValue > stone) {
                    diff++;
                } else {
                    diff = 0;
                }

                if (diff == k) {
                    flag = true;
                    break;

                }

            }
            if (flag) {
                maxValue--;
            } else {
                break;
            }
        }


        return maxValue;
    }
}
