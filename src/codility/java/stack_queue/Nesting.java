package codility.java.stack_queue;

public class Nesting {
    public int solution(String S) {
        int count = 0;

        for (char c : S.toCharArray()) {
            if (c == '(') {
                count++;
            } else {
                if (count == 0) {
                    return 0;
                }
                count--;
            }
        }

        return count == 0 ? 1:0;
    }
}
