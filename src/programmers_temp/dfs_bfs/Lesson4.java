package programmers_temp.dfs_bfs;

import java.util.*;

public class Lesson4 {

    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}};
        new Lesson4().solution(tickets);
    }

    public String[] solution(String[][] tickets) {

        Map<String, PriorityQueue<String>> map = new HashMap();

        for (String[] ticket : tickets) {
            String start = ticket[0];
            String dest = ticket[1];
            PriorityQueue<String> queue = map.getOrDefault(start, new PriorityQueue<String>());
            queue.add(dest);
        }

        List<String> ansList = new ArrayList();
        String start = "ICN";
        ansList.add(start);
        while (map.size() > 0) {
            String dest = map.get(start).poll();
            if (map.get(start).isEmpty()) {
                map.remove(start);
            }
            start = dest;
            ansList.add(start);
        }

        return ansList.stream().toArray(String[]::new);
    }
}
