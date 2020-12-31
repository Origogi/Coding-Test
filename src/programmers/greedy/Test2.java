package programmers.greedy;


public class Test2 {


    public int solution(String name) {
        int answer = 0;

        boolean[] changed = new boolean[name.length()];
        int remainCount = name.length();

        for (int i = 0; i < name.length(); i++) {
            if ('A' == name.charAt(i)) {
                changed[i] = true;
                remainCount--;
            }
        }


        int i = 0;
        while (remainCount > 0) {
            if (!changed[i]) {
                answer += getChangeCount(name.charAt(i));
                changed[i] = true;
                remainCount--;
                continue;
            }

            int leftMove = 0;
            int leftIndex = i;

            while (changed[leftIndex]) {
                leftIndex--;

                if (leftIndex < 0) {
                    leftIndex = name.length() - 1;
                }
                leftMove++;
            }

            int rightMove = 0;
            int rightIndex = i;

            while (changed[rightIndex]) {
                rightIndex++;
                if (rightIndex == name.length()) {
                    rightIndex = 0;
                }
                rightMove++;
            }

            if (leftMove < rightMove) {
                i = leftIndex;
                answer += leftMove;
            } else {
                i = rightIndex;
                answer += rightMove;
            }
        }

        return answer;
    }

    private int getChangeCount(char c) {
        int right = c - 'A';
        int left = 'Z' - c + 1;
        return Math.min(left, right);
    }
}

