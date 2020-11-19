package hackerrank.practice;
// https://www.hackerrank.com/challenges/electronics-shop/problem?h_r=next-challenge&h_v=zen
public class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int result = -1;


        for (int keyboard : keyboards) {

            for (int drive : drives) {
                int sum = keyboard + drive;

                if (sum <= b) {
                    result = Math.max(sum, result);
                }
            }
        }

        return result;

    }

}
