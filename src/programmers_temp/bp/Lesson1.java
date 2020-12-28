package programmers_temp.bp;

import java.util.Arrays;

public class Lesson1 {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        new Lesson1().solution(input);
    }

    public int[] solution(int[] answers) {
        int[] answer = new int[3];

        int p0;
        int p1;
        int p2;

        int[] p0Pattern = {1,2,3,4,5};
        int[] p1Pattern = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p2Pattern = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0;i< answers.length;i++) {
            p0 = p0Pattern[i % p0Pattern.length];
            p1 = p1Pattern[i % p1Pattern.length];
            p2 = p2Pattern[i % p2Pattern.length];

            if (p0 == answers[i]) {
                answer[0]++;
            }
            if (p1 ==answers[i]) {
                answer[1]++;
            }
            if (p2 ==answers[i]) {
                answer[2]++;
            }
        }

        int max = Arrays.stream(answer).max().getAsInt();

        for (int i =0;i<3;i++) {
            if (answer[i]== max) {
                answer[i] = i + 1;
            }
            else {
                answer[i] = 0;
            }
        }

        return Arrays.stream(answer).filter(a -> a !=0).toArray();
    }
}
