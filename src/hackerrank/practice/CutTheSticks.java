package hackerrank.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CutTheSticks {
    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {

        List<Integer> remainList = new LinkedList();
        int min = Integer.MAX_VALUE;
        for (int a : arr) {
            remainList.add(a);
            min = Math.min(a, min);
        }

        List<Integer> ansList = new ArrayList();
        while(remainList.size() >0) {
            int N = remainList.size();
            ansList.add(N);

            int nextMin = Integer.MAX_VALUE;

            for (int i = 0;i<N;i++) {
                int target = remainList.remove(0) - min;
                if (target > 0) {
                    remainList.add(target);
                    nextMin = Math.min(nextMin, target);
                }
            }
            min = nextMin;
        }
        return ansList.stream().mapToInt(Integer::intValue).toArray();

    }
}
