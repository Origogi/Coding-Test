package codility_temp.lesson8;

import java.util.*;

public class EquiLeader {

    public int solution(int[] A) {


        int leader = A[0];
        int leaderCount = 1;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(A[0], 1);

        for (int i = 1; i < A.length; i++) {
            int count = map.getOrDefault(A[i], 0);
            count++;
            map.put(A[i], count);

            if (leaderCount < count) {
                leader = A[i];
                leaderCount = count;
            }
        }

        Queue<Integer> queueA = new LinkedList<>();
        Queue<Integer> queueB = new LinkedList<>();

        for (int a : A) {
            queueB.add(a);
        }

        int countOfLeaderA = 0;
        int countOfLeaderB = leaderCount;
        int ans = 0;

        while (!queueB.isEmpty()) {
            int value = queueB.poll();
            queueA.add(value);


            if (value == leader) {
                countOfLeaderA++;
                countOfLeaderB--;
            }


            if (countOfLeaderA * 2 > queueA.size() && countOfLeaderB * 2 > queueB.size()) {
                ans++;
            }
        }

        return ans;

    }

    public int solution1(int[] A) {

        int lead = 0;
        int count = 0;

        for (int a : A) {
            if (count == 0) {
                lead = a;
                count = 1;
            }
            else {
                if (lead == a) {
                    count++;
                }
                else {
                    count--;
                }
            }
        }
        count = 0;
        for (int a : A) {
            if (a == lead) {
                count++;
            }
        }

        int result = 0;
        int leftCount = 0;
        int rightCount = count;
        for (int i = 0;i < A.length;i++) {
            int leftLength = i + 1;
            int rightLength = A.length - leftLength;

            if (A[i] == lead) {
                leftCount++;
                rightCount--;
            }

            if (leftCount * 2 > leftLength && rightCount * 2 > rightLength) {
                result++;
            }

        }
        return result;
    }
}
