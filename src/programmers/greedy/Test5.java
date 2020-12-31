package programmers.greedy;

import java.util.*;

public class Test5 {

    public static void main(String[] args) {
        new Test5().solution(4, new int[][]{{0, 1, 1}, {0, 2, 2}, {1, 2, 5}, {1, 3, 1}, {2, 3, 8}});
//        new Test5().solution(5, new int[][]{{0,1,5},{1,2,3},{2,3,3},{3,1,2},{3,0,4},{2,4,6},{4,0,7}});
    }



    public int solution(int n, int[][] costs) {

        // 건설 비용이 낮은 순서로 정렬
        Arrays.sort(costs, Comparator.comparingInt(a -> a[2]));

        boolean[] visited = new boolean[n];
        boolean[] bridge = new boolean[costs.length];

        bridge[0] = true;
        visited[costs[0][0]] = true;
        visited[costs[0][1]] = true;

        int ans = costs[0][2];
        int island = 2;

        while (island < n) {

            for (int i =0;i< bridge.length;i++) {

                if (!bridge[i]) {
                    int islA = costs[i][0];
                    int islB = costs[i][1];
                    int bridgeCost = costs[i][2];

                    if (visited[islA] && !visited[islB]
                            || (!visited[islA] && visited[islB])) {
                        visited[islA] = true;
                        visited[islB] = true;
                        bridge[i] = true;
                        island++;
                        ans += bridgeCost;
                        break;
                    }

                }
            }

        }
        return ans;
    }
}
