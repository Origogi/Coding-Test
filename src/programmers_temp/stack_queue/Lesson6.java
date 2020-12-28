package programmers_temp.stack_queue;
//https://programmers.co.kr/learn/courses/30/lessons/42584
public class Lesson6 {

    public static void main(String[] args) {
        int[] arg = {1, 2, 3, 2, 3};
        new Lesson6().solution(arg);
    }

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length - 1; i++) {
            int day = 0;
            for (int j = i + 1; j < prices.length; j++) {
                day++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
            answer[i] = day;
        }

        return answer;

    }
}
