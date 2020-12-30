package programmers.bp;

import java.util.*;

public class Test2 {


    public static void main(String[] args) {
        new Test2().solution("011");
    }

    public int solution(String numbers) {
        int answer = 0;

        char[] chars = numbers.toCharArray();

        Map<Character, Integer> countMap = new HashMap<>();


        for (char c : chars) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        findComb("", countMap);

        for (int number : set) {
            if (isPrime(number)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }
        else if (number == 2) {
            return true;
        }

        for (int i = 2; i *i <= number;i++) {
            if (number % i  == 0) {
                return false;
            }
        }
        return true;
    }

    HashSet<Integer> set = new HashSet<>();

    private void findComb(String str, Map<Character, Integer> map) {

        if (!str.isEmpty()) {
            set.add(Integer.parseInt(str));
        }

        for (char c : map.keySet()) {
            Map<Character, Integer> copyMap = new HashMap<>(map);

            int count = map.get(c) - 1;

            if (count == 0) {
                copyMap.remove(c);
            } else {
                copyMap.put(c, count);

            }
            findComb(str + c, copyMap);
        }
    }
}
