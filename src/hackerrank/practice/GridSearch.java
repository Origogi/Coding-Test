package hackerrank.practice;

public class GridSearch {
    // Complete the gridSearch function below.
    static String gridSearch(String[] G, String[] P) {

        int M = G.length;
        int N = G[0].length();
        char[][] map = new char[M][N];

        for (int i = 0;i<M;i++) {
            for (int j = 0;j<N;j++) {
                map[i][j] = G[i].charAt(j);
            }
        }

        int m = P.length;
        int n = P[0].length();

        char[][] target = new char[m][n];

        for (int i = 0;i<m;i++) {
            for (int j = 0;j<n;j++) {
                target[i][j] = P[i].charAt(j);
            }
        }

        for (int i = 0;i<M - m + 1;i++) {
            for (int j = 0;j<N-n + 1;j++) {
                if (map[i][j] == target[0][0]) {
                    if (check(i,j, map, target)) {
                        return "YES";
                    }
                }


            }
        }

        return "NO";

    }

    static boolean check(int x, int y, char[][] map, char[][] target ) {

        boolean ans = true;

        for (int i = 0;i<target.length;i++) {
            for (int j = 0;j<target[i].length;j++) {
                if (target[i][j] != map[x + i][ y + j]) {
                    ans = false;
                    break;
                }
            }
        }
        return ans;
    }

}
