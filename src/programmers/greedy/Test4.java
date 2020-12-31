package programmers.greedy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {

    public static void main(String[] args) {
        new Test4().solution(new int[]{70, 50, 80, 50}, 100);
    }

    public int solution(int[] people, int limit) {
        int answer = 0;

       Arrays.sort(people);

       int left = 0;
       int right = people.length -1;

       while (left<= right) {
           int leftSum = 0;
           int rightSum = people[right];

           while (leftSum + people[left] + rightSum <= limit) {
               leftSum += people[left +1];
               left++;
           }

           right--;
           answer++;

       }


        return answer;
    }
}
