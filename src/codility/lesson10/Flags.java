package codility.lesson10;

import java.util.ArrayList;
import java.util.List;

public class Flags {

    public static void main(String[] args) {
        int[] A = {1,5,3,4,3,4,1,2,3,4,6,2};
        Flags flags = new Flags();
        int ans = flags.solution1(A);
        System.out.println(ans);
    }

    public int solution(int[] A) {

        List<Integer> peaks = new ArrayList<>();

        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                peaks.add(i);
            }
        }

        if (peaks.size() == 1 || peaks.size() == 0) {
            return peaks.size();
        }


        int maxFlagCount;

        if (Math.sqrt(A.length) > peaks.size()) {
            maxFlagCount = peaks.size();
        } else {
            maxFlagCount = (int) Math.sqrt(A.length);
        }

        for (; maxFlagCount > 0; maxFlagCount--) {
            int currentFlag = peaks.get(0);
            int remainFlag = maxFlagCount - 1;

            for (int i = 1; i < peaks.size(); i++) {
                if (peaks.get(i) - currentFlag >= maxFlagCount) {
                    remainFlag--;
                    currentFlag = peaks.get(i);
                }

                if (remainFlag == 0) {
                    return maxFlagCount;
                }
            }

        }

        return 0;

    }

    public int solution1(int[] A) {
        List<Integer> flagList = new ArrayList<>();

        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                flagList.add(i);
            }
        }

        if (flagList.size() == 1 || flagList.size() == 0) {
            return flagList.size();
        }


        int startFlag = 1;
        int endFlag = flagList.size();
        int result = 1;

        while (startFlag <= endFlag) {
            int targetFlag = (startFlag + endFlag) / 2;

            int used = 0;
            int marked = flagList.get(0);
            boolean success = false;
            for (int i = 0; i < flagList.size(); i++) {

                if (flagList.get(i) >= marked) {
                    used++;
                    marked = flagList.get(i) + targetFlag;
                }

                if (used == targetFlag) {
                    success = true;
                    break;
                }
            }

            if (success) {
                startFlag = targetFlag +1;
                result = targetFlag;
            }
            else {
                endFlag = targetFlag -1;
            }


        }
        return result;
    }
}
