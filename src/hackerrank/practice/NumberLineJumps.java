package hackerrank.practice;


// hackerrank.com/challenges/kangaroo/problem
public class NumberLineJumps {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        int firstX, secondX;
        int firstV, secondV;

        if (x1 > x2) {
            firstX = x2;
            firstV = v2;

            secondX = x1;
            secondV = v1;
        } else {
            firstX = x1;
            firstV = v1;

            secondX = x2;
            secondV = v2;
        }


        while (firstX < secondX) {
            firstX += firstV;
            secondX += secondV;
        }

        if (firstX == secondX) {
            return "YES";
        }
        return "NO";

    }
}
