package hackerrank.example;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = { 3,1,4,2,2,8,4};
        sort(arr, 0, arr.length -1);

        System.out.println(arr);
    }

    static void sort(int[] arr, int start, int end) {
        int left = start;
        int right = end;

        int mid = (end + start) / 2;

        while (left < right) {
            while (arr[left] < arr[mid]) {
                left++;
            }

            while (arr[right] > arr[mid]) {
                right--;
            }

            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        if (left < end) {
            sort(arr, left,end);
        }

        if (start < right) {
            sort(arr, start, right);
        }


    }
}
