package programmers.test;

import java.util.Arrays;

import java.util.stream.IntStream;

public class Lesson1 {

    public static void main(String[] args) {
        int[] input = {0, 1, 0, 0, 5, 4, 0, 0};
        int ans = new Lesson1().solution(input);
        System.out.println(ans);
    }

    public int solution(int[] hList) {

        int max = Arrays.stream(hList).max().getAsInt();
        int maxIdx = IntStream.range(0, hList.length).filter(i -> hList[i] == max).max().getAsInt();

        return solve(IntStream.rangeClosed(0, maxIdx).map(i -> hList[i]).toArray())
                + solve(IntStream.range(maxIdx, hList.length).map(i -> hList[hList.length - 1 - i + maxIdx]).toArray());
    }

    private int solve(int[] hList) {
        int answer = 0;

        int juice = 0;
        int leftH = 0;

        for (int i = 0; i < hList.length; i++) {
            if (leftH <= hList[i]) {
                answer += juice;
                juice = 0;
                leftH = hList[i];
            } else {
                juice += (leftH - hList[i]);
            }
        }

        return answer;
    }
}
