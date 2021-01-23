package hackerrank.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class MatrixLayerRotation {

    enum DIR {
        LEFT,
        DOWN,
        RIGHT,
        UP;
    }

    static class Point {
        int i;
        int j;
        DIR dir;

        Point(int i, int j, DIR dir) {
            this.i = i;
            this.j = j;
            this.dir = dir;
        }
    }

    // Complete the matrixRotation function below.
    static void matrixRotation(List<List<Integer>> matrix, int r) {

        int M = matrix.size();
        int N = matrix.get(0).size();

        int[][] ans = new int[M][N];

        int startX = 0;
        int startY =0;
        int endX = M;
        int endY = N;

        while (startX < endX && startY < endY) {
            List<Integer> list = new LinkedList();
            int i = startX;
            int j = startY;

            int count = (endX -startX) *2 + (endY - startY) * 2 - 4;

            DIR dir = DIR.RIGHT;

            while (list.size() < count) {
                list.add(matrix.get(i).get(j));

                Point nextPoint = getNext(i,j,dir, startX, endX ,startY, endY);
                i= nextPoint.i;
                j = nextPoint.j;
                dir = nextPoint.dir;
            }

            list = rotation(list, r);

            while (list.size() > 0) {
                ans[i][j] = list.remove(0);

                Point nextPoint = getNext(i,j,dir, startX, endX ,startY, endY);
                i= nextPoint.i;
                j = nextPoint.j;
                dir = nextPoint.dir;
            }

            startX++;
            startY++;
            endX--;
            endY--;
        }

        for (int i = 0;i<M;i++) {
            for (int j = 0;j<N;j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static Point getNext(int i, int j, DIR dir, int startX, int endX, int startY, int endY) {
        if (dir == DIR.RIGHT) {
            j++;
            if (j == endY - 1) {
                dir = DIR.DOWN;
            }
        } else if (dir == DIR.DOWN) {
            i++;
            if (i == endX -1) {
                dir = DIR.LEFT;
            }
        } else if (dir == DIR.LEFT) {
            j--;
            if (j == startY) {
                dir = DIR.UP;
            }
        } else if (dir == DIR.UP) {
            i--;
            if (i == startX) {
                dir = DIR.RIGHT;
            }
        }
        return new Point(i,j,dir);
    }


    static List<Integer> rotation(List<Integer> list, int r) {

        r = r % list.size();

        while (r > 0) {
            list.add(list.remove(0));
            r--;
        }
        return list;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] mnr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(mnr[0]);

        int n = Integer.parseInt(mnr[1]);

        int r = Integer.parseInt(mnr[2]);

        List<List<Integer>> matrix = new ArrayList<>();

        IntStream.range(0, m).forEach(i -> {
            try {
                matrix.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        matrixRotation(matrix, r);

        bufferedReader.close();
    }
}
