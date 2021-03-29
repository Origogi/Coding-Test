package codility.java.array;

import java.util.Arrays;

public class OddOccurrencesInArray {

    public int solution(int[] A) {

        return Arrays.stream(A).reduce((a,b) -> a^b).getAsInt();
    }
}
