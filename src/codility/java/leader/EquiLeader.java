package codility.java.leader;

import java.util.HashMap;
import java.util.Map;

public class EquiLeader {

    public static void main(String[] args) {
        new EquiLeader().solution(new int[]{4,3,4,4,4,2});
    }


    public int solution(int[] A) {

        Map<Integer, Integer> map = new HashMap<>();

        int leader = 0;
        int leaderCount = 0;

        for (int a : A) {
            int count = map.getOrDefault(a, 0) + 1;
            map.put(a, count);

            if (count > leaderCount) {
                leader = a;
                leaderCount = count;
            }
        }

        double left = 0;
        int leftLength = 0;
        double right = leaderCount;
        int rightLength = A.length;

        int ans = 0;

        for (int i = 0;i< A.length -1;i++) {
            if (A[i] == leader) {
                left++;
                right--;
            }

            leftLength++;
            rightLength--;

            if (left / leftLength> 0.5 && right / rightLength > 0.5) {
                ans++;
            }
        }
        return ans;
    }
}
