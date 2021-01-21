package hackerrank.practice;

public class TwoCharacters {
    // Complete the alternate function below.
    static int alternate(String s) {

        int maxLength = 0;

        if (s.length() <= 1) {
            return maxLength;
        }

        for (int i = 0;i<25;i++) {
            for (int j = 1 + i;j<26;j++) {
                char A = (char)('a' + i);
                char B = (char)('a' + j);
                char lastSeen = '_';

                int length = 0;
                for (char c : s.toCharArray()) {
                    if (A == c || B == c) {
                        if (lastSeen == c) {
                            length = 0;
                            break;
                        }
                        lastSeen = c;
                        length++;
                    }

                }
                maxLength = Math.max(length, maxLength);
            }

        }
        return maxLength;
    }
}
