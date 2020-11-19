package programmers.stack_queue;

import java.util.*;
//https://programmers.co.kr/learn/courses/30/lessons/42587
public class Lesson4 {

    public static void main(String[] args) {

        int[] pr = {1, 1, 9, 1, 1, 1};
        int loc = 0;

        new Lesson4().solution(pr, loc);
    }

    public int solution(int[] priorities, int location) {
        int answer = 1;

        Queue<Task> waitingQueue = new LinkedList<>();
        PriorityQueue<Task> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < priorities.length; i++) {
            Task task = new Task(i, priorities[i]);
            waitingQueue.add(task);
            priorityQueue.add(task);
        }

        while (!waitingQueue.isEmpty()) {
            if (priorityQueue.peek().priority == waitingQueue.peek().priority) {
                priorityQueue.remove();
                Task task = waitingQueue.remove();
                if (task.index == location) {
                    break;
                } else {
                    answer++;
                }
            } else {
                waitingQueue.add(waitingQueue.remove());
            }
        }

        System.out.println(answer);
        return answer;
    }

    class Task implements Comparable<Task> {

        int index;
        int priority;

        public Task(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }

        @Override
        public int compareTo(Task other) {
            return other.priority - this.priority;
        }

    }
}
