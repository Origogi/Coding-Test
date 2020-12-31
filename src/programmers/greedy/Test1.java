package programmers.greedy;

import java.util.Arrays;

public class Test1 {

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] clothes = new int[n];

        Arrays.fill(clothes, 1);

        for (int l : lost) {
            clothes[ l -1]--;
        }

        for (int r : reserve) {
            clothes[ r -1]++;
        }

        for (int i = 0; i < n; i++) {
            if (clothes[i] == 0) {
                int left = i -1;
                int right = i +1;

                if (left >= 0 && clothes[left] > 1) {
                    clothes[left]--;
                    clothes[i]++;
                }
                else if (right < n && clothes[right] > 1) {
                    clothes[right]--;
                    clothes[i]++;
                }
            }
        }

        answer = (int) Arrays.stream(clothes).filter(a -> a>0).count();


        return answer;
    }
}
