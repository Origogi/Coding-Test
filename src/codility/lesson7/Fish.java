package codility.lesson7;

import java.util.Stack;

public class Fish {
    public static void main (String[] args) {
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};

        System.out.println(new Fish().solution(A, B));
    }

    public int solution (int [] A, int [] B) {
        Stack<Integer> stack = new Stack();

        int topFishDir = B[0];
        stack.push(A[0]);

        int ans = 0;

        for (int i = 1;i <A.length;i++) {
            // System.out.println(stack.peek() + "/" + topFishDir);

            if (topFishDir == B[i]) {
                stack.push(A[i]);
                topFishDir = B[i];
            }
            else {
                if (topFishDir == 1 && B[i] == 0) {
                    while (!stack.isEmpty() && stack.peek() < A[i]) {
                        stack.pop();
                    }

                    if (stack.isEmpty()) {
                        stack.push(A[i]);
                        topFishDir = B[i];
                    }

                }
                else {
                    ans += stack.size();
                    stack.clear();

                    stack.push(A[i]);
                    topFishDir = B[i];
                }
            }

        }
        return ans + stack.size();
    }

    public int solution1 (int [] A, int [] B) {

        Stack<Integer> stack = new Stack<>();

        int ans = 0;
        for (int i = 0;i < A.length;i++) {
            if (stack.isEmpty()) {
                if (B[i] == 0) {
                    ans++;
                }
                else {
                    stack.push(A[i]);
                }
            }
            else {
                if (B[i] == 1) {
                    stack.push(A[i]);
                }
                else {
                    while (!stack.isEmpty() && stack.peek() < A[i]) {
                        stack.pop();
                    }

                    if (stack.isEmpty()) {
                        ans++;
                    }
                }
            }
        }
        return ans + stack.size();

    }
}
