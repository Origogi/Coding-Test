package programmers.bp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {

        new Test1().solution(null);

    }

    public int[] solution(int[] answers) {


        int[][] patterns = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] score = {0,0,0};

        for (int i = 0; i < answers.length; i++) {

            for (int j = 0; j < 3; j++) {
                int[] pattern = patterns[j];
                if (pattern[i % pattern.length] == answers[i]) {
                    score[j]++;
                }
            }
        }

        int max = Arrays.stream(score).max().getAsInt();

        List<Integer> ans = new ArrayList<>();

        for (int i = 0;i< 3;i++) {
            if (score[i] == max) {
                ans.add(i +1);
            }
        }

        Collections.sort(ans);
        return ans.stream().mapToInt(a->a).toArray();
    }
}
