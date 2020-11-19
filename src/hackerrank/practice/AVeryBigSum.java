package hackerrank.practice;

// https://www.hackerrank.com/challenges/a-very-big-sum/problem

import java.util.Arrays;

public class AVeryBigSum {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        return Arrays.stream(ar).reduce(0, (a,b) -> a +b);
    }

}
