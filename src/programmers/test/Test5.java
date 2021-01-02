package programmers.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test5 {

    public static void main(String[] args) {
        new Test5().solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500});
    }

    class Music {
        String genre;
        int play;
        int index;

        public Music(String genre, int play, int index) {
            this.genre = genre;
            this.play = play;
            this.index = index;
        }
    }

    public int[] solution(String[] genres, int[] plays) {


        List<Music> listMusic =
                IntStream
                        .range(0, plays.length)
                        .mapToObj(i -> new Music(genres[i], plays[i], i)).collect(Collectors.toList());

        Map<String, Long> map = listMusic
                .stream()
                .collect(Collectors.groupingBy(m -> m.genre, Collectors.summingLong(m -> m.play)));

        List<String> sortedGenre = map.entrySet().stream().sorted((a, b) -> {
            if (a.getValue() > b.getValue()) {
                return -1;
            } else if (a.getValue() < b.getValue()) {
                return 1;
            }
            return 0;
        }).map(a -> a.getKey()).collect(Collectors.toList());

        Map<String, List<Music>> musicMap = listMusic.stream().collect(Collectors.groupingBy(a -> a.genre));

        List<Integer> ansList = new LinkedList<>();


        for (String genre : sortedGenre) {
            List<Music> pickedList = musicMap.get(genre);
            List<Integer> ans = pickedList.stream().sorted((a,b)-> {
                if (a.play == b.play) {
                    return a.index - b.index;
                }
                return b.play - a.play;
            }).limit(2).map(a -> a.index).collect(Collectors.toList());
            ansList.addAll(ans);
        }
        return ansList.stream().mapToInt(a ->a).toArray();
    }
}
