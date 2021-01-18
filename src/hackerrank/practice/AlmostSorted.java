package hackerrank.practice;

public class AlmostSorted {


    public static void main(String[] args) {
        almostSorted(new int[]{4, 2});

    }

    static String solved(int[] arr) {
        final int N = arr.length;

        int l = 0;
        int r = N - 1;

        while (l < N - 1 && arr[l] <= arr[l + 1]) {
            l++;
        }

        while (r > 0 && arr[r - 1] <= arr[r]) {
            r--;
        }

        if (r == 0) {
            return "yes";
        }

        if ((l > 0 && arr[l - 1] > arr[r])
                || r < N - 1 && arr[r + 1] < arr[l]) {
            return "no";
        }

        //check reverse
        int m = l;

        while (m < r && arr[m] >= arr[m + 1]) {
            m++;
        }

        if (m == r) {
            return "yes\n" + ((r - l == 1) ? "swap " : "reverse ") + (l + 1) + " " + (r + 1);
        }
        //check swap
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return "no";
            }
        }
        return "yes\nswap "  + (l + 1) + " " + (r + 1);

    }



    static void almostSorted(int[] arr) {

        System.out.println(solved(arr));
    }
}