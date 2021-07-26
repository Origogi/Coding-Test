package hackerrank.practice;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BeautifulPairs {
    public static int beautifulPairs(List<Integer> A, List<Integer> B) {
        Map<Integer, Long> map = B.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int ans = 0;

        int n = A.size();

        for (int a : A) {
            if (map.containsKey(a)) {
                ans++;
                long count = map.get(a) - 1;

                if (count == 0) {
                    map.remove(a);
                } else {
                    map.put(a, count);
                }
            }
        }

        if (ans == n) {
            return ans - 1;
        } else {
            return ans + 1;
        }
    }

}
