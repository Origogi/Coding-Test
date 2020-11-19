package programmers.hash;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//https://programmers.co.kr/learn/courses/30/lessons/42579
public class lesson4 {

    public static void main(String[] args) {

        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        new lesson4().solution(genres, plays);
    }

    public int sum(List<MyData> dataList) {
        int sum = 0;
        for (MyData myData : dataList) {
            sum += myData.play;
        }
        return sum;
    }

    public int[] solution(String[] genres, int[] plays) {

        Comparator<MyData> comparator = (a, b) -> {
            if (a.play == b.play) {
                return a.index - b.index;
            }
            return b.play - a.play;
        };

        int[] ans = IntStream.range(0, genres.length)
                .mapToObj(i -> new MyData(genres[i], plays[i], i))
                .collect(Collectors.groupingBy(myData -> myData.genre))
                .entrySet().stream()
                .sorted((a, b) -> sum(b.getValue()) - sum(a.getValue()))
                .flatMap(a -> a.getValue()
                        .stream()
                        .sorted(comparator)
                        .limit(2))
                .mapToInt(myData -> myData.index)
                .toArray();

        System.out.println(ans);

        return ans;
    }

    class MyData {
        String genre;
        int play;
        int index;

        public MyData(String genre, int play, int index) {
            this.genre = genre;
            this.play = play;
            this.index = index;
        }
    }

}