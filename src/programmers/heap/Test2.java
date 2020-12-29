package programmers.heap;

import java.util.*;
import java.util.stream.Collectors;

public class Test2 {


    public static void main(String[] args) {
        new Test2().solution(new int[][]{{0, 3}, {3, 3}, {6, 3}, {0, 9}});
    }

    int currentEnd = 0;

    class Job implements Comparable<Job> {
        int start;
        int end;
        int duration;

        public Job(int start, int duration) {
            this.start = start;
            this.end = start + duration;
            this.duration = duration;
        }

        @Override
        public int compareTo(Job other) {
            int diffA = start - currentEnd;
            int diffB = other.start - currentEnd;

            if (diffA >= 0 && diffB >= 0) {
                if (diffA == diffB) {
                    return duration - other.duration;
                } else {
                    return diffA - diffB;
                }
            }
            if (diffA >= 0) {
                return 1;
            } else if (diffB >= 0) {
                return -1;
            }

            int timeA = duration + other.duration + diffA + diffB + duration;
            int timeB = duration + other.duration + diffA + diffB + other.duration;

            return timeA - timeB;        }
    }


    public int solution(int[][] jobs) {
        int answer = 0;


        List<Job> list = Arrays.stream(jobs).map(a -> new Job(a[0], a[1])).collect(Collectors.toList());

        int totalTime = 0;

        while (!list.isEmpty()) {
            Collections.sort(list);

            Job job = list.remove(0);

            if (currentEnd <= job.start) {
                currentEnd = job.end;
                totalTime += job.duration;
            } else {
                int diff = currentEnd - job.start;
                currentEnd = job.duration + currentEnd;
                totalTime += diff + job.duration;
            }
        }

        return totalTime / jobs.length;
    }
}
