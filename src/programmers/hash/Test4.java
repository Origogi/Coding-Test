package programmers.hash;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test4 {

    public static void main(String[] args) {
    }


    class Music {
        int idx;
        String genres;
        int play;

        public Music(int idx, String genres, int play) {
            this.idx = idx;
            this.genres = genres;
            this.play = play;
        }
    }

    public int[] solution(String[] genres, int[] plays) {

        List<Integer> ansList = new LinkedList<>();

        List<Music> musicList = IntStream.range(0, genres.length).mapToObj(i -> new Music(i, genres[i], plays[i])).collect(Collectors.toList());

        Map<String, List<Music>> genresMap = musicList.stream().collect(Collectors.groupingBy(music -> music.genres));
        Map<String, Long> playCountMap = musicList.stream().collect(Collectors.groupingBy(music -> music.genres, Collectors.summingLong(music-> music.play)));

        List<String> sortedGenreList = playCountMap.entrySet().stream().sorted((a, b) -> (int)(b.getValue() - a.getValue())).map(a -> a.getKey()).collect(Collectors.toList());

        for (String genre : sortedGenreList) {
            ansList.addAll(genresMap.get(genre).stream().sorted((a, b) -> {
                if (a.play == b.play) {
                    return a.idx - b.idx;
                }
                return b.play - a.play;
            }).map(a -> a.idx).limit(2).collect(Collectors.toList()));
        }


        return ansList.stream().mapToInt(a->a).toArray();
    }
}
