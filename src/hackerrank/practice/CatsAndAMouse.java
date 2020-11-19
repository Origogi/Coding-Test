package hackerrank.practice;

public class CatsAndAMouse {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        int distanceA = Math.abs(x -z);
        int distanceB = Math.abs(y -z);

        if (distanceA < distanceB) {
            return  "Cat A";
        } else if (distanceB < distanceA) {
            return "Cat B";
        } else {
            return "Mouse C";
        }

    }

}
