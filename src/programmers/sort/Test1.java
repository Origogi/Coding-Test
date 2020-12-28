package programmers.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

    public static void main(String[] args) {
        new Test1().solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

        for (int i = 0;i<answer.length;i++) {
            int[] command = commands[i];

            List<Integer> subList = new ArrayList<>(list.subList(command[0] -1, command[1]) );
            Collections.sort(subList);

            answer[i] = subList.get(command[2] -1);
        }


        return answer;
    }
}
