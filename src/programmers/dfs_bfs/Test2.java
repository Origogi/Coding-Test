package programmers.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Test2 {

    public int solution(int n, int[][] computers) {
        int answer = 0;

        boolean[] visited = new boolean[computers.length];

        for (int i = 0;i < visited.length; i++) {
            if (visited[i] == false) {
                bfs(i, visited, computers);
                answer++;
            }
        }

        return answer;
    }

    private void bfs(int current, boolean[] visited, int[][] computers) {

        Queue<Integer> q = new LinkedList<>();

        q.add(current);
        visited[current] = true;

        while (!q.isEmpty()) {
            int n = q.poll();

            for (int i = 0; i < computers[n].length; i++) {
                if (computers[n][i] == 1 && visited[i] == false) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }

}
