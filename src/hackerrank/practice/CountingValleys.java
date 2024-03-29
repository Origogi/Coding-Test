package hackerrank.practice;


// https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup&h_r=next-challenge&h_v=zen
public class CountingValleys {

    public static void main(String[] args) {
        countingValleys(12, "UDUUUDUDDD");
    }

    // Complete the sockMerchant function below.
    public static int countingValleys(int steps, String path) {

        char[] pathArray = path.toCharArray();

        int level = pathArray[0] == 'U' ? 1 : -1;
        int result = 0;

        for (int i = 1;i< pathArray.length;i++) {

            level += pathArray[i] == 'U' ? 1 : -1;

            if (level == 0 && pathArray[i] == 'U') {
                result++;
            }
        }
        return result;
    }

}
