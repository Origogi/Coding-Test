package programmers.sort;

import java.util.Arrays;
//https://programmers.co.kr/learn/courses/30/lessons/42747
public class Lesson3 {

    public int solution(int[] citations) {

        int answer = 0;
        if (citations.length == 1) {
            return 0;
        }

       Arrays.sort(citations);

        for (int i =0;i<citations.length;i++) {
            int h = citations.length - i;

            if (citations[i] >= h) {
                answer = h;
                break;
            }

        }

        return answer;
    }
}
