package programmers.stack_queue;

import java.util.*;
//https://programmers.co.kr/learn/courses/30/lessons/42583
public class Lesson2 {

    public static void main(String[] args) {
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {

        Queue<Truck> waitingQueue = new LinkedList<>();

        int currentTime = 0;
        int index = 0;
        int currentWeight = 0;

        while (index < truck_weights.length || !waitingQueue.isEmpty()) {
            if (!waitingQueue.isEmpty() && waitingQueue.peek().endTime == currentTime) {
                currentWeight -= waitingQueue.remove().weight;
            }

            if (index < truck_weights.length && currentWeight + truck_weights[index] <= weight) {
                waitingQueue.add(new Truck(truck_weights[index], currentTime + bridge_length));
                currentWeight += truck_weights[index];
                index++;
            }
            currentTime++;
        }
        return currentTime;
    }

    class Truck {
        int weight;
        int endTime;

        public Truck(int weight, int endTime) {
            this.weight = weight;
            this.endTime = endTime;
        }
    }
}
