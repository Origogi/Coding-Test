package hackerrank.practice;

import java.util.List;

public class PickingNumbers {

    public static void main(String[] args) {
    }

    public static int pickingNumbers(List<Integer> a) {
        int[] array = a.stream().sorted().mapToInt(i -> i).toArray();

        int max = 0;

        for (int i = 0; i < array.length; i++) {
            int subArrayLength = 1;
            while (i + 1 < array.length && array[i + 1] - array[i - subArrayLength + 1] <= 1) {
                subArrayLength++;
                i++;
            }

            max = Math.max(subArrayLength, max);

        }
        return max;

    }
}
