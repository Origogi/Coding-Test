package hackerrank.practice;

import java.util.ArrayList;
import java.util.List;

public class ManasaAndStones {
    // Complete the stones function below.
    static int[] stones(int n, int a, int b) {

        if (a == b) {
            return new int[]{a* (n-1)};
        }

        List<Integer> ans = new ArrayList();

        if (a>b) {
            int temp = a;
            a= b;
            b = temp;
        }

        int start = (n-1) * a;
        int end = (n-1) * b;

        int diff = b -a;

        for (int i = start;i<=end;i += diff) {
            ans.add(i);
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();

    }
}
