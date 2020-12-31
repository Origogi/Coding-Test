package programmers.greedy;

import java.util.*;

public class Test3 {

    public static void main(String[] args) {
        new Test3().solution("4177252841", 4);
    }

    public String solution(String number, int k) {

        StringBuffer sb = new StringBuffer();
        int idx = 0;
        for (int i = 0;i< number.length() - k;i++) {
            char max = '0' -1;

            for (int j = idx;j<i + k +1;j++) {
                if (max < number.charAt(j)) {
                    max = number.charAt(j);
                    idx = j +1;
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
}
