package hackerrank.practice;

// https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

public class Two_DArray {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ans = Math.max(ans, getSum(arr, i, j));
            }
        }
        return ans;

    }

    private static int getSum(int[][] arr, int i, int j) {
        int sum = (arr[i][j] + arr[i][j + 1] + arr[i][j + 2]) +
                arr[i + 1][j + 1] +
                ((arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]));

        return sum;

    }

}
