package hackerrank.practice;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectedCellsInGrid {

    static int M;
    static int N;

    static boolean[][] visited;

    // Complete the connectedCell function below.
    static int connectedCell(int[][] matrix) {
        M = matrix.length;
        N = matrix[0].length;

        visited = new boolean[M][N];

        for (int i = 0;i<M;i++) {
            for (int j = 0;j<N;j++) {
                visited[i][j] = (matrix[i][j] == 0);
            }
        }

        int ans = 0;

        for (int i = 0;i<M;i++) {
            for (int j = 0;j<N;j++) {
                if(!visited[i][j]) {
                    ans = Math.max(bfs(matrix, i,j), ans);
                }
            }
        }
        return ans;
    }

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x= x;
            this.y = y;
        }
    }

    private static int bfs (int[][] matrix, int x, int y) {
        Queue<Point> queue = new LinkedList();

        queue.add(new Point(x,y));
        visited[x][y] = true;

        int ans = 0;

        int[] dirX = {1,-1,0,0, 1,1,-1,-1};
        int[] dirY = {0,0,1,-1,1,-1,1,-1};

        while (queue.size() > 0) {
            Point current = queue.remove();
            ans++;

            for (int i = 0;i<8;i++) {
                int nextX = current.x + dirX[i];
                int nextY = current.y + dirY[i];

                if (((nextX >=0 && nextX <M) && (nextY >= 0 && nextY <N) )
                        && !visited[nextX][nextY]) {
                    queue.add(new Point(nextX,nextY));
                    visited[nextX][nextY] = true;
                }
            }
        }
        return ans;
    }

}
