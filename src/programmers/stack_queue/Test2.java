package programmers.stack_queue;

import java.util.*;

public class Test2 {
    public int[] solution(int[] progresses, int[] speeds) {

        int[] remainDate = new int[progresses.length];

        for (int i = 0; i < remainDate.length; i++) {
            remainDate[i] = (int) Math.ceil((100 - progresses[i]) /(double)  speeds[i]);
        }

        List<Integer> ansList = new LinkedList<>();

        int front = remainDate[0];
        int jobSize = 1;

        for (int i = 1; i < remainDate.length; i++) {
            if (front >= remainDate[i]) {
                jobSize++;
            } else {
                ansList.add(jobSize);
                front = remainDate[i];
                jobSize = 1;
            }
        }

        ansList.add(jobSize);

        return ansList.stream().mapToInt(a ->a).toArray();
    }

}
