package hackerrank.example;

import java.util.List;


// 1. Find the number
public class lesson1 {

    public static void main(String[] args) {

    }


    public static String findNumber(List<Integer> arr, int k) {
        // Write your code here

        for (int n : arr) {
            if (n == k) {
                return "YES";
            }
        }

        return "NO";

    }
}
