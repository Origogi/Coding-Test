package hackerrank.practice;

public class RepeatedString {
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long countA = 0;

        for (char c : s.toCharArray()) {
            if (c == 'a') {
                countA++;
            }
        }

        countA = countA * (n / s.length());

        int mod = (int)(n % s.length());

        s = s.substring(0, mod);

        for (char c : s.toCharArray()) {
            if (c == 'a') {
                countA++;
            }
        }

        return countA;


    }


}
