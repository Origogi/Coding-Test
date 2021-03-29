package codility.java.stack_queue;

import java.util.Stack;

public class Fish {

    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8

        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for ( int i = A.length - 1; i >= 0; i--) {

            if (B[i] == 0) {
                stack.push(A[i]);
            } else {
                while (stack.size() > 0 && stack.peek() < A[i]) {
                    stack.pop();
                }

                if (stack.isEmpty()) {
                    ans++;
                }
            }
        }
        return ans + stack.size();
    }

}
