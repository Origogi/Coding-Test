package codility_temp.lesson8;

public class Dominator {
    public int solution(int[] A) {
        if (A.length == 0) {
            return -1;
        }

        int lead = 0;
        int count = 0;
        int ans = 0;

        for (int i =0;i<A.length;i++) {
            if (count == 0) {
                lead = A[i];
                count++;
                ans = i;
            }
            else {
                if (lead == A[i]) {
                    count++;
                }
                else {
                    count--;
                }
            }
        }

        if (count == 0) {
            return -1;
        }

        int totalCount = 0;

        for (int a : A) {
            if (lead == a) {
                totalCount++;
            }
        }

        System.out.println(totalCount);

        return totalCount *2 > (double)A.length? ans :-1;
    }

    public int solution1(int[] A) {
        int lead = 0;
        int count = 0;

        for (int a :A) {
            if (count == 0) {
                count = 1;
                lead = a;
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
        int result = 0;
        for (int i = 0;i< A.length;i++) {
            if (A[i] == lead) {
                result = i;
                count++;
            }
        }

        return count * 2 > A.length? result:-1;
    }
}
