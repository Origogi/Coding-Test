package programmers.dp;

import java.util.Arrays;

public class Test3 {

    public static void main(String[] args) {
        new Test3().solution(4, 3, new int[][]{{2, 2}});
    }

    public int solution(int m, int n, int[][] puddles) {

        int[][] path = new int[n][m];

        Arrays.stream(puddles).forEach(p -> {
            path[p[1] - 1][p[0] - 1] = -1;
        });


        path[0][0] = 1;

        int[] moveX = {1, 0};
        int[] moveY = {0, 1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (path[i][j] == -1) {
                    continue;
                }

                for (int k = 0; k < 2; k++) {
                    int nextX = j + moveX[k];
                    int nextY = i + moveY[k];

                    if (nextX < m && nextY < n && path[nextY][nextX] != -1) {
                        path[nextY][nextX] += path[i][j];
                        path[nextY][nextX] %= 1000000007;
                    }
                }


            }
        }


        return path[n - 1][m - 1] % 1000000007;
    }
}
