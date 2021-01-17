package hackerrank.practice;

import java.util.LinkedList;
import java.util.List;

public class CircularArrayRotation {
    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] A, int k, int[] queries) {
        List<Integer> list = new LinkedList();

        for (int a : A) {
            list.add(a);
        }

        k = k % A.length;

        while (k > 0) {
            list.add(0, list.remove(list.size() -1));
            k--;
        }

        int[] ans = new int[queries.length];

        for (int i = 0;i<ans.length;i++) {
            ans[i] = list.get(queries[i]);
        }
        return ans;


    }
}
