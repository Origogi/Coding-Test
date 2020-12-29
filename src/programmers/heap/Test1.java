package programmers.heap;

import java.util.*;

public class Test1 {

    public static void main(String[] args) {
        new Test1().solution(new int[]{1,2}, 5);
    }

    public int solution(int[] scoville, int K) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int s : scoville) {
            pq.add(s);
        }

        int i =0;
        while (pq.size() > 1 && pq.peek() < K) {
            int comb = pq.poll() + pq.poll() * 2;
            pq.add(comb);
            i++;
        }
        int answer = -1;
        if (pq.peek() >= K) {
            answer = i;
        }

        return answer;
    }
}
