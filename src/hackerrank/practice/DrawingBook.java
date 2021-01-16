package hackerrank.practice;

public class DrawingBook {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        /*
         * Write your code here.
         */

        int[] currentPage = {0,1};

        int frontCount = 0;
        while (currentPage[0] != p && currentPage[1] != p) {
            frontCount++;

            currentPage[0] += 2;
            currentPage[1] += 2;
        }

        int backcount = 0;
        if (n % 2 == 0) {
            currentPage[0] = n;
            currentPage[1] = n +1;
        } else {
            currentPage[0] = n - 1;
            currentPage[1] = n;         }

        while (currentPage[0] != p && currentPage[1] != p) {
            backcount++;

            currentPage[0] -= 2;
            currentPage[1] -= 2;
        }

        return Math.min(backcount, frontCount);

    }
}
