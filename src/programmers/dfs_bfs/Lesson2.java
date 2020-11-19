package programmers.dfs_bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
//https://programmers.co.kr/learn/courses/30/lessons/43162
public class Lesson2 {

    public static void main(String[] args) {
        int[][] path = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        int n = 3;

        new Lesson2().solution(n, path);

    }

    public int solution(int n, int[][] computers) {

        int[] visited = new int[n];
        int flag = 1;

        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                visited[i] = flag;
                Queue<Integer> queue = new LinkedList();
                queue.add(i);

                while (!queue.isEmpty()) {
                    int current = queue.poll();
                    for (int j = 0; j < n; j++) {
                        int next = j;
                        if (computers[current][next] == 1 && visited[next] == 0) {
                            visited[next] = flag;
                            queue.add(next);
                        }
                    }
                }
                flag++;
            }
        }
        return flag - 1;
    }

}
