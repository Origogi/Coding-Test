package hackerrank.practice;

import java.util.Arrays;

public class BigSorting {
    // Complete the bigSorting function below.
    static String[] bigSorting(String[] unsorted) {

        Arrays.sort(unsorted, (a, b) -> {

            int diffLeng = a.length() - b.length();

            if (diffLeng == 0) {
                for (int i = 0;i<a.length();i++) {

                    if (a.charAt(i) != b.charAt(i)) {
                        return a.charAt(i) - b.charAt(i);
                    }

                }
            }

            return diffLeng;
        });


        return unsorted;
    }
}
