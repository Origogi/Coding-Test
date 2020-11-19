package hackerrank.practice;

// https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

public class JumpingOnTheClouds {

    public static void main(String[] args) {
        jumpingOnClouds(new int[]{0,0,1,0,0,1,0});
    }


    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int currentIdx = 0;
        int ans = 0;

        while (currentIdx < c.length - 1) {
            if (currentIdx + 2 < c.length && c[currentIdx + 2] != 1) {
                currentIdx += 2;
            } else {
                currentIdx++;
            }
            ans++;
        }
        return ans;

    }

}
