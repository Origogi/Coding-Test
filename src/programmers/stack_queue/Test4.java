package programmers.stack_queue;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test4 {


    class Task {
        int priority;
        int location;

        public Task(int priority, int location) {
            this.priority = priority;
            this.location = location;
        }
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;

        List<Task> list = IntStream
                .range(0, priorities.length)
                .mapToObj(a -> new Task(priorities[a], a))
                .collect(Collectors.toList());

        Queue<Task> waiting = new LinkedList<>(list);
        List<Task> priorityQueue = new LinkedList<>(list);
        Collections.sort(priorityQueue, (a,b) -> b.priority - a.priority);

        answer =1;
        while (true) {
            Task front = waiting.poll();

            if (front.priority == priorityQueue.get(0).priority) {
                if (location == front.location) {
                    break;
                }
                priorityQueue.remove(0);
                answer++;
            } else {
                waiting.add(front);
            }
        }

        return answer;
    }
}
