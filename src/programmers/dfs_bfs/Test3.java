package programmers.dfs_bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {

    public static void main(String[] args) {
        new Test3().solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log"}
        );
    }

    public int solution(String begin, String target, String[] words) {
        int answer = 0;

        int[] visited = new int[words.length + 1];
        List<String> wordList = new ArrayList<>();
        Arrays.fill(visited, Integer.MAX_VALUE);
        wordList.add(begin);
        wordList.addAll(Arrays.stream(words).collect(Collectors.toList()));

        dfs(0, 0, target, visited, wordList);

        return wordList.contains(target) ? visited[wordList.indexOf(target)] : 0;
    }

    private void dfs(int current, int depth, String target, int[] visited, List<String> words) {
        visited[current] = depth;

        for (int i = 0; i < words.size(); i++) {
            if (visited[i] > depth + 1 && isAdj(words.get(current), words.get(i))) {
                dfs(i, depth + 1, target, visited, words);
            }
        }
        return;
    }

    private boolean isAdj(String s1, String s2) {
        int diffCount = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffCount++;
            }
        }
        return diffCount == 1;

    }


}
