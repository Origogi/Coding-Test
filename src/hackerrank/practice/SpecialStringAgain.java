package hackerrank.practice;

public class SpecialStringAgain {

    public static void main(String[] args) {
        substrCount(7, "abcbaba");
    }


    // Complete the substrCount function below.
    static long substrCount(int n, String s) {

        char[] arr = s.toCharArray();

        int result = 0;

        // check same character
        for (int i = 0; i < n; i++) {

            int charLeng = 1;

            while (i < n - 1 && arr[i] == arr[i + 1]) {
                i++;
                charLeng++;
            }
            result += ((charLeng * (charLeng + 1)) / 2);

        }

        // check palindrome
        for (int i = 0; i < n; i++) {

            int charLeng = 1;

            while (i - charLeng >= 0 && i + charLeng < n
                    && arr[i] != arr[i - 1]
                    && arr[i - 1] == arr[i + charLeng]
                    && arr[i - 1] == arr[i - charLeng]) {

                charLeng++;
            }
            result += charLeng - 1;

        }

        return result;

    }
}
