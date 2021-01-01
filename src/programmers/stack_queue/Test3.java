package programmers.stack_queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class Test3 {

    public static void main(String[] args) {
        new Test3().solution(2, 10, new int[]{7,4,5,6});
    }


    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        List<Integer> waitingQueue = Arrays.stream(truck_weights).boxed().collect(Collectors.toList());
        Queue<Integer> bridge = new LinkedList<>();

        answer++;
        int truck = waitingQueue.remove(0);
        bridge.add(truck);

        int currentWeight = truck;
        while (waitingQueue.size() > 0 || currentWeight > 0) {
            if (bridge.size() == bridge_length) {
                currentWeight -= bridge.poll();
            }

            int next =0;
            if (!waitingQueue.isEmpty() && currentWeight + waitingQueue.get(0) <= weight) {
                next = waitingQueue.remove(0);
            }

            currentWeight+= next;
            bridge.add(next);
            answer++;
        }
        return answer;
    }
}
