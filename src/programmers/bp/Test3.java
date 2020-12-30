package programmers.bp;

public class Test3 {

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];


        int w;
        int h = 1;

        for (;h<=brown;h++) {
            if (yellow % h != 0) {
                continue;
            }
            w = yellow / h;

            int totalSqr = (w + 2) * (h + 2);

            if (totalSqr - (w * h) == brown) {
                answer[0] = w + 2;
                answer[1] = h + 2;
                break;
            }

        }


        return answer;
    }


}
