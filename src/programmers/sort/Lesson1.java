package programmers.sort;

import java.util.Arrays;
import java.util.stream.Collectors;
//https://programmers.co.kr/learn/courses/30/lessons/42746
public class Lesson1 {

    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int commandIdx = 0;

        for (int[] command : commands) {
            int i = command[0];
            int j = command[1];
            int k = command[2];

            int m = Arrays.stream(array)
                    .mapToObj(e -> e)
                    .collect(Collectors.toList())
                    .subList(i-1, j)
                    .stream()
                    .sorted()
                    .skip(k - 1)
                    .findFirst()
                    .get();

            answer[commandIdx] = m;
            commandIdx++;
        }

        return answer;
    }
}
