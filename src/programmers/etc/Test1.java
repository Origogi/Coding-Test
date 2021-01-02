package programmers.etc;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Test1 {

    public static void main(String[] args) {
        new Test1().solution(3,"abcd", 4);

//        new Test1().solution(new String[]{"o","o","t","t"});

//        new Test1().solution(new int[]{44,33,69,62});
//        new Test1().solution(new int[]{23,61,46});

    }

    public int solution (int[] ages) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int age : ages) {
            while (age > 0) {
                int n = age % 10;
                if (n == 9 || n == 6) {
                    int num9 = map.getOrDefault(9,0);
                    int num6 = map.getOrDefault(6, 0);

                    if (num9 > num6) {
                        map.put(6, num6 + 1);
                    } else {
                        map.put(9, num9 +1);
                    }
                } else {
                    map.put(n, map.getOrDefault(n,0) + 1);
                }
                age = age /10;
            }
        }

        int max = 0;

        for (int n : map.values()) {
            max = Math.max(n , max);
        }

        return max;

    }

    public long[] solution(String[] words) {
        long[] ans = new long[words.length];

        Map<String, Long> map = new HashMap<>();

        for (int i = 0;i<words.length;i++) {
            if(map.containsKey(words[i])) {
                map.put(words[i],(long)(i +1));
            }
        }

        for (int i = 0;i<words.length;i++) {
            ans[i] = map.get(words[i]);
        }

        return ans;


    }

    public String solution(int n, String text, int second) {

        char[] ans = new char[n];

        for (int i = 0;i<ans.length;i++) {
            ans[i] = '_';
        }

        int mod = second % (text.length() + n);

        if (mod == 0) {
            return String.valueOf(ans);
        }

        second = mod;
        int i = 0;

        if (second > n) {
            i = 0;
        } else {
            i = n-second;
        }

        int j = 0;

        if (second > n) {
            j = second - n;
        }

        while (second > 0 && i< ans.length && j < text.length()) {
            ans[i] = text.charAt(j);
            i++;
            j++;
            second--;
        }
        return String.valueOf(ans);

    }

}
