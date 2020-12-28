package programmers_temp.sort;

import java.util.Arrays;
//https://programmers.co.kr/learn/courses/30/lessons/42746
public class Lesson2 {

    public String solution(int[] numbers) {

        String answer = "";
        answer = Arrays.stream(numbers)
                .mapToObj(a -> String.valueOf(a))
                .sorted((a, b) -> (b + a).compareTo(a + b))
                .reduce((a, b) -> a + b)
                .get();

        if (answer.startsWith("0")) {
            return "0";
        }
        return answer;
    }
}
