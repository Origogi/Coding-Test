package programmers.sort;

import java.util.Arrays;
import java.util.Collections;

public class Test3 {

    public static void main(String[] args) {
        new Test3().solution(new int[]{3, 0, 6, 1, 5});
    }

    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

       for (int i = 0;i < citations.length;i++) {
           int h = citations.length - i;

           if (h >= citations[i]) {
               answer = h;
           }
       }

        return answer;
    }
}
