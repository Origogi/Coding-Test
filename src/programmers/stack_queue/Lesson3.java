package programmers.stack_queue;

import java.util.*;
import java.util.stream.IntStream;

//https://programmers.co.kr/learn/courses/30/lessons/42586
public class Lesson3 {

    public static void main(String[] args) {
        int[] progress = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        new Lesson3().solution(progress, speeds);
    }

    public int[] solution(int[] progresses, int[] speeds) {

        int[] endDates = IntStream
                .range(0, progresses.length)
                .map(i -> (int) (Math.ceil((100 - progresses[i]) / (double) speeds[i])))
                .toArray();

        Queue<Integer> queue = new LinkedList<>();
        queue.add(endDates[0]);

        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i < endDates.length; i++) {
            if (queue.peek() < endDates[i]) {
                ans.add(queue.size());
                queue.clear();
            }
            queue.add(endDates[i]);
        }

        ans.add(queue.size());

        return ans.stream().mapToInt(a -> a).toArray();
    }
}
