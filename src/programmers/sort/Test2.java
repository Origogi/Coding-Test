package programmers.sort;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test2 {


    public String solution(int[] numbers) {
        String ans = Arrays.stream(numbers)
                .mapToObj(n -> n + "")
                    .sorted((a, b) ->
                        Integer.parseInt(b + a) - Integer.parseInt(a + b))
                .collect(Collectors.joining());

        if (ans.startsWith("0")) {
            ans = "0";
        }
        return ans;
    }

}
