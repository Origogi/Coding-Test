package programmers.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Test6 {

    public static void main(String[] args) {
        new Test6().solution(new int[][]{{-20, 15}, {-14, -5}, {-18, -13}, {-5, -3}});
    }



    public int solution(int[][] routes) {
        int answer = 0;

        int camera = -30001;

        Arrays.sort(routes, Comparator.comparingInt(a -> a[1]));

        for (int[] route : routes) {
            if (camera < route[0]) {
                answer++;
                camera = route[1];
            }
        }

        return answer;
    }
}
