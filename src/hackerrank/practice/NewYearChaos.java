package hackerrank.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewYearChaos {

    public static void main(String[] args) {
        minimumBribes(new int[] {1, 2 ,5, 3, 7, 8 ,6, 4});
    }

    static void minimumBribes(int[] q) {


        for(int i = 0 ; i < q.length ; i ++) {
            if(q[i]-(i+1)>2) {
                System.out.println("Too chaotic");
                return;
            }
        }
        int ans = 0;
        for (int i = 0;i< q.length;i++) {
            if (i+1 != q[i]) {

                int target = i +1;

                for (int j = i +1;j< q.length;j++) {

                    if (q[j] == target) {
                        //Swap
                        int temp = q[j-1];
                        q[j-1] = q[j];
                        q[j] = temp;
                        ans +=1;
                        i--;
                        break;

                    }
                }
            }

        }
        System.out.println(ans);


    }
}
