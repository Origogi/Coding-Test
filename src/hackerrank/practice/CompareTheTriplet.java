package hackerrank.practice;

// https://www.hackerrank.com/challenges/compare-the-triplets/problem

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplet {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int resultA = 0;
        int resultB = 0;

        for (int i = 0;i< a.size();i++) {
            int valueA = a.get(i);
            int valueB = b.get(i);

            if (valueA > valueB ) {
                resultA++;
            }
            else if (valueA < valueB) {
                resultB++;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(resultA);
        result.add(resultB);

        return result;

    }
}
