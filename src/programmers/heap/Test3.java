package programmers.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Test3 {
    public static void main(String[] args) {
//        new Test3().solution(new String[]{"I 7","I 5","I -5","D -1"});
        new Test3().solution(new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"});

    }

    public int[] solution(String[] operations) {
        int[] answer = {0, 0};

        PriorityQueue<Integer> ascPQ = new PriorityQueue<>();
        PriorityQueue<Integer> dscPQ = new PriorityQueue<>(Collections.reverseOrder());

        for (String op : operations) {
            if (op.startsWith("D") && dscPQ.isEmpty()) {
                continue;
            }

            if (op.equals("D 1")) {
                int n = dscPQ.remove();
                ascPQ.remove(n);

            } else if (op.equals("D -1")){
                int n = ascPQ.remove();
                dscPQ.remove(n);
            } else {
                int n = Integer.parseInt(op.split(" ")[1]);
                ascPQ.offer(n);
                dscPQ.offer(n);
            }
        }

        if (!ascPQ.isEmpty()) {
            answer[0] = dscPQ.peek();
            answer[1] = ascPQ.peek();
        }
        return answer;


    }


}
