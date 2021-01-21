package hackerrank.practice;

public class CavityMap {
    // Complete the cavityMap function below.
    static String[] cavityMap(String[] grid) {

        int M = grid.length;
        int N = grid[0].length();

        char[][] map = new char[M][N];

        for (int i = 0;i<M;i++) {
            for (int j = 0;j<N;j++) {
                map[i][j] = grid[i].charAt(j);
            }
        }

        int[] dirX = {0,0,1,-1};
        int[] dirY = {1,-1,0,0};

        for (int i = 1;i<M-1;i++) {
            for (int j =1;j<N-1;j++) {
                if (map[i][j] != 'X') {

                    boolean flag = true;
                    for (int k = 0;k<4;k++) {
                        int x = i + dirX[k];
                        int y = j + dirY[k];

                        if (map[x][y] >= map[i][j] || map[x][y] == 'X') {
                            flag = false;
                            break;
                        }
                    }

                    if (flag) {
                        map[i][j] = 'X';
                    }
                }
            }
        }

        String[] ans = new String[M];
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<M;i++) {

            for (char c : map[i]) {
                sb.append(c);
            }
            ans[i] = sb.toString();
            sb.setLength(0);

        }
        return ans;
    }

}
