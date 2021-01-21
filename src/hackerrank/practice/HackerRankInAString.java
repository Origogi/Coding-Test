package hackerrank.practice;

public class HackerRankInAString {
    // Complete the hackerrankInString function below.
    static String hackerrankInString(String s) {
        String hackerrank = "hackerrank";
        int index = 0;
        String ans = "NO";
        for (char c : s.toCharArray()) {
            if (c == hackerrank.charAt(index)) {
                index++;
            }

            if (index == hackerrank.length()) {
                ans = "YES";
                break;
            }

        }
        return ans;

    }
}
