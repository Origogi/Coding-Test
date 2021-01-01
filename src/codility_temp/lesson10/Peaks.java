package codility_temp.lesson10;

import java.util.ArrayList;
import java.util.List;

public class Peaks {


    public static void main(String[] args) {
        int[] A = {1,2,3,4,3,4,1,2,3,4,6,2};
        Peaks peaks = new Peaks();

        int ans = peaks.solution(A);
//        System.out.println(ans);
    }
    public int solution(int[] A) {
        List<Integer> peaks = new ArrayList<>();

        for (int i =1 ;i<A.length-1;i++) {
            if (A[i] > A[i-1] && A[i] >A[i+1]) {
                peaks.add(i);
//                System.out.print(i + " ");
            }
        }
//        System.out.println();

        for (int blockCount = peaks.size();blockCount>0;blockCount--) {
            if (A.length %blockCount != 0) {
                continue;
            }

            int blockIndex = 0;
            int blockSize = A.length/blockCount;

            for (int peak : peaks) {
                if (peak >= blockIndex * blockSize && peak < (blockIndex + 1)  * blockSize) {
                    blockIndex++;
                }
            }

            if (blockIndex == blockCount) {
                return blockCount;
            }

        }
        return 0;
    }

    public int solution1(int[] A) {
        int N = A.length;

        if (N < 3) {
            return 0;
        }

        int[] prefixSum = new int[N];

        for (int i = 1; i < N - 1; i++) {
            prefixSum[i] = prefixSum[i - 1];

            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                prefixSum[i]++;
            }
        }
        prefixSum[N - 1] = prefixSum[N - 2];

        int flagCount = prefixSum[N - 1];

        if (flagCount <=1) {
            return flagCount;
        }

        int result = 1;
        for (int i = 2; i <= flagCount; i++) {
            if (N % i != 0) {
                continue;
            }

            int length = N / i;
            boolean noPeak = false;
            for (int j = 0; j < N; j = j + length) {
                if (j == 0) {
                    if (prefixSum[length - 1] == 0) {
                        noPeak = true;
                        break;
                    }
                } else {
                    if (prefixSum[j + length - 1] - prefixSum[j - 1] == 0) {
                        noPeak = true;
                        break;
                    }
                }
            }

            if (!noPeak) {
                result = i;
            }
        }

        return result;
    }

}
