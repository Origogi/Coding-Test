package codility.lesson5;

public class GenomicRangeQuery {

    public static void main(String[] args) {

    }

    public int[] solution(String S, int[] P, int[] Q) {

        int[] A = new int[S.length()];
        int[] C = new int[S.length()];
        int[] G = new int[S.length()];
        int[] T = new int[S.length()];

        int[] ans = new int[P.length];

        char c = S.charAt(0);

        if (c == 'A') {
            A[0]++;
        } else if (c == 'C') {
            C[0]++;
        } else if (c == 'G') {
            G[0]++;
        } else {
            T[0]++;
        }

        for (int i = 1; i < S.length(); i++) {
            c = S.charAt(i);

            A[i] = A[i - 1];
            C[i] = C[i - 1];
            G[i] = G[i - 1];
            T[i] = T[i - 1];

            if (c == 'A') {
                A[i]++;
            } else if (c == 'C') {
                C[i]++;
            } else if (c == 'G') {
                G[i]++;
            } else {
                T[i]++;
            }
        }

        for (int i = 0; i < P.length; i++) {
            if (P[i] == 0) {
                int end = Q[i];
                if (A[end] > 0) {
                    ans[i] = 1;
                } else if (C[end] > 0) {
                    ans[i] = 2;
                } else if (G[end] > 0) {
                    ans[i] = 3;
                } else {
                    ans[i] = 4;
                }
            } else {
                int start = P[i] - 1;
                int end = Q[i];

                if (A[end] - A[start] > 0) {
                    ans[i] = 1;
                } else if (C[end] - C[start] > 0) {
                    ans[i] = 2;
                } else if (G[end] - G[start] > 0) {
                    ans[i] = 3;
                } else {
                    ans[i] = 4;
                }

            }
        }

        return ans;

    }

    public int[] solution1(String S, int[] P, int[] Q) {
        int N = S.length();

        // A == 0
        // C == 1
        // G == 2
        // T == 3
        int[][] prefixSum = new int[4][N];

        char[] chars = S.toCharArray();

        prefixSum[getIndexOfFactor(chars[0])][0] = 1;

        for (int i = 1; i < N; i++) {
            prefixSum[getIndexOfFactor(chars[i])][i]++;

            for (int j = 0; j < 4; j++) {
                prefixSum[j][i] += prefixSum[j][i - 1];
            }
        }

        int[] result = new int[P.length];

        for (int i = 0; i < Q.length; i++) {
            int start = P[i];
            int end = Q[i];

            if (start == 0) {
                for (int j = 0; j < 4; j++) {
                    if (prefixSum[j][end] > 0) {
                        result[i] = j + 1;
                        break;
                    }
                }
            } else {
                for (int j = 0; j < 4; j++) {
                    if (prefixSum[j][end] > prefixSum[j][start -1]) {
                        result[i] = j + 1;
                        break;
                    }
                }
            }
        }

        return result;

    }

    int getIndexOfFactor(char c) {
        if (c == 'A') {
            return 0;
        } else if (c == 'C') {
            return 1;
        } else if (c == 'G') {
            return 2;
        } else {
            return 3;
        }
    }


}
