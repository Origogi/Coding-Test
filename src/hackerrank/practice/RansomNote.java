package hackerrank.practice;

import java.util.HashMap;


// https://www.hackerrank.com/challenges/ctci-ransom-note/problem
public class RansomNote {

    public static void main(String[] args) {



    }

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String keyword : magazine) {
            map.put(keyword, map.getOrDefault(keyword,0) + 1);
        }

        for (String keyword : note) {
            int count = map.getOrDefault(keyword, 0);

            if (count == 0) {
                System.out.println("No");
                return;
            }
            count--;
            map.put(keyword,count);
        }

        System.out.println("Yes");
    }
}
