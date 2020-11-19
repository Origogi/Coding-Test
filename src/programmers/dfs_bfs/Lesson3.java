package programmers.dfs_bfs;

import java.util.*;
import java.util.stream.Collectors;

public class Lesson3 {

    public static void main(String[] args) {
        String[] input = "hot, dot, dog, lot, log".split(",");
        new Lesson3().solution("hit", "cog", input);

    }

    public int solution(String begin, String target, String[] words) {
        int answer = 0;

        Map<String, Integer> visited = Arrays.stream(words).collect(Collectors.toMap(word -> word, word -> -1));

        int depth = 0;

        Queue<String> queue = new LinkedList();

        queue.add(begin);
        visited.put(begin, depth);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            depth = visited.get(current) + 1;
            for (String next : visited.keySet()) {
                if (visited.get(next) == -1 && isAdjust(next, current)) {
                    queue.add(next);
                    visited.put(next, depth);
                }
            }
        }

        answer = visited.getOrDefault(target, 0);
        if (answer == -1) {
            return 0;
        }
        return answer;
    }

    private boolean isAdjust(String next, String current) {

        int diff = 0;
        for (int i = 0; i < next.length(); i++) {
            if (current.charAt(i) != next.charAt(i)) {
                diff++;
                if (diff > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
