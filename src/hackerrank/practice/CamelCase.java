package hackerrank.practice;

public class CamelCase {
    // Complete the camelcase function below.
    static int camelcase(String s) {
        int ans = 1;
        for (char c : s.toCharArray()) {
            if (c >='A' && c <='Z') {
                ans++;
            }
        }
        return ans;
    }
}
