package hackerrank.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class TheFullCountingSort {
    static class Node implements Comparable<Node> {
        int index;
        String key;
        String value;

        Node(int index, String key, String value) {
            this.index = index;
            this.key = key;
            this.value = value;
        }

        public int compareTo(Node n) {
            if (key.equals(n.key)) {
                return index - n.index;
            }
            return key.compareTo(n.key);
        }

    }


    // Complete the countSort function below.
    static void countSort(List<List<String>> arr) {
        List<Node> nodeList = new LinkedList();

        for (int i = 0; i < arr.size() / 2; i++) {
            List<String> n = arr.get(i);
            nodeList.add(new Node(i, n.get(0), "-"));

        }

        for (int i = arr.size() / 2; i < arr.size(); i++) {
            List<String> n = arr.get(i);
            nodeList.add(new Node(i, n.get(0), n.get(1)));
        }

        StringBuilder sb = new StringBuilder();

        Collections.sort(nodeList);

        for (int i = 0; i < arr.size(); i++) {
            sb.append(nodeList.get(i).value);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "")
                                .split(" "))
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        countSort(arr);

        bufferedReader.close();
    }
}
