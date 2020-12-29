package programmers.dfs_bfs;

import java.util.*;
import java.util.stream.Collectors;

public class Test4 {

    public static void main(String[] args) {

        new Test4().solution(new String[][]{{"ICN", "A"},{"ICN", "A"},{"ICN", "A"}, {"A", "ICN"},{"A", "ICN"}});
    }

    public String[] solution(String[][] tickets) {

        travel("ICN", new ArrayList<>(), new boolean[tickets.length], tickets);


        return set.stream().sorted().findFirst().get().split(" ");
    }

    HashSet<String> set = new HashSet<>();

    private void travel(String current, List<String> path, boolean[] used, String[][] tickets) {

        String next = "";
        path.add(current);

        for (int i = 0; i < used.length; i++) {
            if (tickets[i][0].equals(current) && used[i] == false) {
                next = tickets[i][1];
                boolean[] copyUsed = Arrays.copyOf(used, used.length);
                copyUsed[i] = true;
                travel(next, new ArrayList<>(path), copyUsed, tickets);
            }
        }

        if (path.size() == tickets.length + 1) {
            set.add(path.stream().collect(Collectors.joining(" ")));
        }
    }


}


