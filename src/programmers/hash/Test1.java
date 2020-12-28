package programmers.hash;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {

    public static void main(String[] args) {

    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Long> participantMap = Arrays.stream(participant).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (String key : completion) {
            long count = participantMap.get(key) -1;

            if (count == 0) {
                participantMap.remove(key);
            } else {
                participantMap.put(key, count);
            }
        }

        answer = participantMap.keySet().stream().findFirst().get();

        return answer;
    }
}
