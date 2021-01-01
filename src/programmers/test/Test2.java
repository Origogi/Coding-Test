package programmers.test;

public class Test2 {

    public static void main(String[] args) {
        new Test2().solution(4);
    }

    int[] memory = new int[60000 + 1];

    public int solution(int n) {

        memory[1] = 1;
        memory[2] = 2;

        for (int i = 3;i<=n;i++) {
            memory[i] = (memory[i -2] + memory[i -1]) % 1000000007;
        }

        int answer = memory[n];
        return answer;
    }

}
