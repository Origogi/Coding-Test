package programmers.dp;

import java.util.Arrays;

public class Test2 {


    public static void main(String[] args) {
        new Test2().solution(new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}});
    }


    public int solution(int[][] triangle) {
        int[][] memory = new int[triangle.length][triangle.length];

        memory[0][0] = triangle[0][0];

        for (int i = 0; i < triangle.length - 1; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                memory[i + 1][j] = Math.max(memory[i + 1][j], triangle[i + 1][j] + memory[i][j]);
                memory[i + 1][j + 1] = Math.max(memory[i + 1][j + 1], triangle[i + 1][j + 1] + memory[i][j]);

                int a = 0;
            }
        }

        return Arrays.stream(memory[memory.length - 1]).max().getAsInt();
    }

}
