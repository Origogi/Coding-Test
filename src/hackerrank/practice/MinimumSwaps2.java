package hackerrank.practice;


// https://www.hackerrank.com/challenges/minimum-swaps-2/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
public class MinimumSwaps2 {

    public static void main(String[] args) {
        minimumSwaps(new int[]{1 ,3, 5 ,2, 4, 6, 7});
    }

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {

        int i =0;
        int ans = 0;

        while (i < arr.length) {
            if (arr[i] != i +1) {
                // swap
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
                ans++;
                i = 0;
            }
            i++;
        }
        return ans;

    }
}
