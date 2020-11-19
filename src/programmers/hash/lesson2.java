package programmers.hash;

import java.util.*;

public class lesson2 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        Set<String> set = new HashSet<>();

        for (String number : phone_book) {
            String key = "";

            for (char c : number.toCharArray()) {
                key += c;

                if (set.contains(key)) {
                    return false;
                }
            }
            set.add(key);
        }
        return answer;
    }
}
