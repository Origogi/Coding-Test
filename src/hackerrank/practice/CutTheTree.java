package hackerrank.practice;

import java.util.List;

public class CutTheTree {

    public static int cutTheTree(List<Integer> data, List<List<Integer>> edges) {
        // Write your code here

        final int N = data.size();
        boolean[] visited = new boolean[N + 1];

        travelTree(1, data, edges, visited);

        int totalSum = data.stream().reduce((a, b) -> a + b).get();

        int ans = totalSum;

        for (int d : data) {
            int left = d;
            int right = totalSum - left;

            ans = Math.min(Math.abs(left - right), ans);
        }
        return ans;

    }

    private static int travelTree(int currentV, List<Integer> data, List<List<Integer>> edges, boolean[] visited) {
        int sum = data.get(currentV - 1);

        visited[currentV] = true;

        for (List<Integer> edge : edges) {

            int nextV = -1;

            if (edge.get(0) == currentV) {
                nextV = edge.get(1);
            } else if (edge.get(1) == currentV) {
                nextV = edge.get(0);
            }

            if (nextV != -1 && !visited[nextV]) {
                sum += travelTree(nextV, data, edges, visited);
            }
        }

        return sum;
    }
}
