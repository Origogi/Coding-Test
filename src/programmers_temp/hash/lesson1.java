package programmers_temp.hash;

//https://programmers.co.kr/learn/courses/30/lessons/42576

import java.util.HashMap;

public class lesson1 {


    public static void main(String[] args) {

    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> notCompletedMap = new HashMap<>();

        for (String key : participant) {
            Integer count = notCompletedMap.get(key);
            if (null == count) {
                count = 1;
            } else {
                count++;
            }
            notCompletedMap.put(key, count);
        }

        for (String key : completion) {
            Integer count = notCompletedMap.get(key);
            if (count == 1) {
                notCompletedMap.remove(key);
            } else {
                notCompletedMap.put(key, count - 1);
            }
        }

        for (String key : notCompletedMap.keySet()) {
            answer = key;
        }
        return answer;
    }
}
