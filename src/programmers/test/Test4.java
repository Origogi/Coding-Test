package programmers.test;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Test4 {
    public static void main(String[] args) {
        new Test4().solution(1, new int[] {2,1,2});
    }


    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->b-a);

        Arrays.stream(works).forEach(a -> pq.add(a));

        while (n > 0 && pq.peek() !=0) {
            int work = pq.poll();
            pq.add(work - 1);
            n--;
        }

        long answer = 0;

        for (int work : pq) {
            answer += Math.pow(work,2);
        }

        return answer;
    }
}
