package hackerrank.practice;

public class AppendAndDelete {

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {

        int i = 0;

        while (i < s.length() && i< t.length()) {
            if (s.charAt(i) != t.charAt(i)) {
                break;
            }
            i++;
        }

        int diffS = s.length() - i;
        int diffT = t.length() - i;

        if (((k - diffS + diffT) % 2 == 0 && k >= diffS + diffT ) || k >= s.length() + t.length()) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
