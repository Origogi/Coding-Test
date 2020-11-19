package codility.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CountSemiprimes {

    public static void main(String[] args) {


        int[] P = {1, 4, 16};
        int[] Q = {26, 10, 20};
        new CountSemiprimes().solution(26,P ,Q);
    }

    public int[] solution(int N, int[] P, int[] Q) {
        boolean[] primes = new boolean[N + 1];

        Arrays.fill(primes, true);

        int i = 2;

        while (i * i <= N) {
            if (primes[i]) {
                int k = i + i;

                while (k <= N) {
                    primes[k] = false;
                    k += i;
                }
            }
            i++;
        }

        List<Integer> primeList = new ArrayList<>();
        for (int j = 2; j < primes.length; j++) {
            if (primes[j]) {
                primeList.add(j);
            }
        }

        boolean[] semiPrimes = new boolean[N+1];

        semiPrimes[1] = false;

        for (int primeA : primeList) {
            for (int primeB : primeList) {
                int semiPrime = primeA * primeB;
                if (semiPrime <= N) {
                    semiPrimes[semiPrime] = true;
                }
                else {
                    break;
                }
            }
        }

        int[] prefixSum = new int[N+1];

        for (int j =2;j<=N;j++) {
            prefixSum[j] =prefixSum[j-1];
            if (semiPrimes[j]) {
//                System.out.print(j + " ");

                prefixSum[j]++;
            }

        }

        System.out.println();

        int[] ans = new int[P.length];

        for (int j = 0;j<P.length;j++) {
            int start = P[j]-1;
            int end = Q[j];

            ans[j] = prefixSum[end] - prefixSum[start];

//            System.out.println(ans[j]);
        }


        return ans;
    }


}
