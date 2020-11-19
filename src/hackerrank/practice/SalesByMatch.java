package hackerrank.practice;


// https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup&h_r=next-challenge&h_v=zen
public class SalesByMatch {

    public static void main(String[] args) {
        countingValleys(12, "DDUUDDUDUUUD");
    }

    // Complete the sockMerchant function below.
    public static int countingValleys(int steps, String path) {

        char[] pathArray = path.toCharArray();

        int level = pathArray[0] == 'U' ? 1 : -1;
        int result = 0;

        for (int i = 1;i< pathArray.length;i++) {

            if (pathArray[i -1] == 'U' && pathArray[i] == 'D') {
                if (level > 0) {
                    result++;
                }
            }
            level += pathArray[i] == 'U' ? 1 : -1;
        }
        return result;
    }

}
