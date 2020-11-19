package programmers.stack_queue;


import java.util.Stack;

public class Lesson1 {

    public static void main(String[] args) {
        int[] heights = {3, 9, 9, 3, 5, 7, 2};
        new Lesson1().solution(heights);
    }

    public int[] solution(int[] heights) {

        Stack<MyData> stack = new Stack<>();
        stack.add(new MyData(1, heights[0]));

        int[] answer = new int[heights.length];

        for (int i = 1; i < heights.length; i++) {
            while (!stack.isEmpty() && stack.peek().height <= heights[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                answer[i] = 0;
            } else {
                answer[i] = stack.peek().pos;
            }
            stack.push(new MyData(i + 1, heights[i]));
        }

        return answer;
    }

    public int[] solution1(int[] heights) {
        int[] answer = new int[heights.length];

        for (int i = 1;i<heights.length;i++) {

        }
        return answer;
    }

    class MyData {
        int pos;
        int height;

        public MyData(int pos, int height) {
            this.pos = pos;
            this.height = height;
        }
    }
}
