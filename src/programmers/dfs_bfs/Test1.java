package programmers.dfs_bfs;

import java.util.HashSet;

public class Test1 {


    public int solution(int[] numbers, int target) {

        return sum(-1, 0, target, numbers) ;
    }

    private int sum(int i, int currentSum, int target, int[] numbers) {
        if (i == numbers.length - 1) {
            if (currentSum == target) {
                return 1;
            } else {
                return 0;
            }
        }

        return sum(i + 1, currentSum + numbers[i + 1], target, numbers)
                + sum(i + 1, currentSum - numbers[i + 1], target, numbers);

    }


}
