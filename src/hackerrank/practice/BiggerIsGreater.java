package hackerrank.practice;

import java.util.*;

public class BiggerIsGreater {
    // Complete the biggerIsGreater function below.
    static String biggerIsGreater(String w) {
        char [] charArray = w.toCharArray();

        String ans = "no answer";

        for (int i = charArray.length -1;i>0;i--) {

            if (charArray[i] > charArray[i -1]) {
                // Find
                char target = (char)(charArray[i-1] + 1);

                List<Character> charList = new ArrayList();

                for (int j = i -1;j < charArray.length;j++) {
                    charList.add(charArray[j]);
                }

                Set<Character> set = new HashSet(charList);

                while (!set.contains(target)) {
                    target += 1;
                }

                if (target > 'z') {
                    return "no answer";
                }

                charList.remove((Character) target);

                String tail = target + "";

                Collections.sort(charList);

                for (char c : charList) {
                    tail += c;
                }

                String head = w.substring(0, w.length() - tail.length());
                ans = head + tail;
                break;
            }

        }
        return ans;

    }
}
