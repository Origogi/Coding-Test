package codility.java.prime_composite;

import java.util.HashSet;

public class CountFactors {
    public int solution(int N) {
        HashSet<Double> set = new HashSet<>();

        for (double i = 1;i*i<=N;i++) {
            if (N % i == 0) {
                set.add(i);
                set.add(N/ i);
            }
        }
        return set.size();
    }
}
