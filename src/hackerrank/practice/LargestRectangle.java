package hackerrank.practice;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class LargestRectangle {

    public static void main(String[] args) {
        largestRectangle(new int[] { 11, 11, 10, 10, 10});
    }

    // Complete the largestRectangle function below.
    static long largestRectangle(int[] height) {
        Stack<Integer> stack = new Stack<>();

        int i =0;
        int max = 0;
        while (i < height.length) {
            if (stack.isEmpty() || height[stack.peek()] <= height[i]) {
                stack.push(i);
                i++;
            } else {
                int p = stack.pop();
                int h = height[p];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(w * h, max);
            }
        }

        while (!stack.isEmpty()) {
            int p = stack.pop();
            int h = height[p];
            int w = stack.isEmpty() ? i : i - stack.peek() - 1;
            max = Math.max(w * h, max);
        }
        return max;

    }
}
