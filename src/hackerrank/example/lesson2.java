package hackerrank.example;

import java.util.ArrayList;
import java.util.List;


// 2. Odd numbers
public class lesson2 {


    public static List<Integer> oddNumbers(int l, int r) {
        List<Integer> result = new ArrayList<>();

        for (int i = l; i<=l;i++) {
            if (i % 2 == 1) {
                result.add(i);
            }
        }
        return result;

    }
}
