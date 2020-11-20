package hackerrank.practice;

import java.util.*;

public class FrequencyQueries {

//- 1  : Insert x in your data structure.
//- 2 : Delete one occurence of y from your data structure, if present.
//- 3 : Check if any integer is present whose frequency is exactly . If yes, print 1 else 0.

    // Complete the freqQuery function below.

    static final int INSERT = 1;
    static final int DELETE = 2;
    static final int CHECK = 3;

    static List<Integer> freqQuery(List<List<Integer>> queries) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] qts = new int[queries.size() + 1];

        List<Integer> ans = new ArrayList<>();
        int count = 0;

        for (List<Integer> query : queries) {
            int operator = query.get(0);
            int value = query.get(1);

            switch (operator) {
                case INSERT:
                    count = map.getOrDefault(value, 0);
                    map.put(value, count + 1);
                    qts[count + 1]++;
                    qts[count]--;
                    break;
                case DELETE:
                    if (map.containsKey(value)) {
                        count = map.get(value);

                        if (count == 1) {
                            map.remove(value);
                        } else {
                            map.put(value, count - 1);
                        }
                        qts[count]--;
                        qts[count - 1]++;

                    }
                    break;
                case CHECK:
                    if (qts.length <= value) {
                        ans.add(0);
                    } else {
                        ans.add(qts[value] > 0 ? 1 : 0);
                    }
                    break;
            }
        }
        return ans;
    }
}
