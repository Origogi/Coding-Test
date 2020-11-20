package hackerrank.practice;

public class BubbleSort {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int count = 0;

        for (int i = 0 ;i< a.length;i++) {

            for (int j = 0;j< a.length-1;j++) {

                if (a[j] > a[j+1] ) {
                    // Swap
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j +1] = temp;
                    count++;
                }
            }
        }

        System.out.println(String.format("Array is sorted in %d swaps.", count));
        System.out.println(String.format("First Element: %d", a[0]));
        System.out.println(String.format("Last Element: %d", a[a.length-1]));
    }

}
