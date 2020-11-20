package hackerrank.practice;

public class AlternatingCharacter {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {

        char currentC = 'z';

        int ans = 0;
        for (char c : s.toCharArray()) {
            if (c != currentC) {
                currentC = c;
            } else {
                ans++;
            }
        }
        return ans;
    }
}
