package hackerrank.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FormingMagicSquare {

    public static void main(String[] args) {

        int[][] array = {{4, 9 ,2}, {3,5,7}, {8,1,5}};
        formingMagicSquare(array);
    }

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
        List<int[][]> magicSquareList = new ArrayList<>();
        magicSquareList.add(magicSquare(new int[3][3], 0,1,1));
        magicSquareList.add(magicSquare(new int[3][3], 1,0,1));
        magicSquareList.add(magicSquare(new int[3][3], 1,2,1));
        magicSquareList.add(magicSquare(new int[3][3], 2,1,1));

        int ans = Integer.MAX_VALUE;
        for (int[][] magicSquare : magicSquareList) {
            int cost = 0;
            for (int i = 0;i<3;i++) {
                for (int j = 0;j<3 ;j++) {
                    cost += Math.abs(s[i][j] - magicSquare[i][j]);
                }
            }
            ans = Math.min(ans, cost);

        }

        return ans;

    }

    static int[][] magicSquare(int[][] m, int x, int y, int v) {

        m[x][y] = v;

        int nextX = x - 1;
        int nextY = y + 1;

        if (nextX == -1) {
            nextX = 2;
        }

        if (nextY == 3) {
            nextY = 0;
        }

        if (m[nextX][nextY] != 0) {
            nextX = x + 1;
            nextY = y;
        }

        if (nextX == 3) {
            nextX = 0;
        }

        if (m[nextX][nextY] !=0) {
            return m;
        }
        else {
            return magicSquare(m,nextX,nextY,v +1);
        }
    }
}
