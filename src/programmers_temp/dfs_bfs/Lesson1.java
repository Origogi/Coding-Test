package programmers_temp.dfs_bfs;
//https://programmers.co.kr/learn/courses/30/lessons/43165
public class Lesson1 {

    public static void main(String[] args) {
        int[] arg = {1, 1, 1, 1, 1};
        new Lesson1().solution(arg, 3);

    }

    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(0, numbers, target, 0);
        return answer;
    }

    int dfs(int index, int[] numbers, int target, int sum) {
        if (index == numbers.length) {
            if (target == sum) {
                return 1;
            }
            return 0;
        }

        int answer = 0;

        answer += dfs(index + 1, numbers, target, sum + numbers[index]);
        answer += dfs(index + 1, numbers, target, sum - numbers[index]);

        return answer;
    }
}
