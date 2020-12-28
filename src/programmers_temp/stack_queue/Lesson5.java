package programmers_temp.stack_queue;

//https://programmers.co.kr/learn/courses/30/lessons/42585
public class Lesson5 {

    public static void main(String[] args) {
        new Lesson5().solution("()(((()())(())()))(())");
    }

    public int solution(String arrangement) {
        int answer = 0;

        arrangement = arrangement.replace("()", "0");

        int stackSize = 0;

        for (char c : arrangement.toCharArray()) {
            if (c == '(') {
                stackSize++;
            } else if (c == ')') {
                answer++;
                stackSize--;
            } else {
                answer += stackSize;
            }
        }
        return answer;
    }


}
