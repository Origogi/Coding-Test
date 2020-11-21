package hackerrank.practice;

import java.util.List;

public class SherlockAndArray {


    // Complete the balancedSums function below.
    static String balancedSums(List<Integer> arr) {

        long sum = 0;
        for (int n : arr) {
            sum += n;
        }

        long left = 0;
        long right = sum;

        for (int i = 0; i< arr.size();i++) {
            if (i != 0) {
                left += arr.get(i -1);
            }
            right -= arr.get(i);

            if (left == right) {
                return "YES";
            }
        }
        return "NO";
    }
}
