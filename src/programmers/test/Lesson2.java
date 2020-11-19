package programmers.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Lesson2 {

    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MyMap<String, String> map = new MyMap<>();

        while (true) {
            String input = br.readLine();
            String[] token = input.split(" ");

            if (token[0].equals("exit")) {
                break;
            } else if (token[0].equals("add")) {
                String k = token[1];
                String v = token[2];
                map.add(k, v);
            } else if (token[0].equals("get")) {
                try {
                    System.out.println(map.get(token[1]));
                } catch (Exception e) {
                    System.out.println("-1");
                }

            } else if (token[0].equals("evict")) {
                map.evict();
            } else if (token[0].equals("remove")) {
                try {
                    System.out.println(map.remove(token[1]));
                } catch (Exception e) {
                    System.out.println("-1");
                }
            } else {
                System.out.println("Unknown");
            }
        }
    }

    static class MyMap<K, V> {
        Map<K, V> hashMap = new HashMap();

        Queue<K> queue = new LinkedList();

        public void add(K key, V value) {
            hashMap.put(key, value);
            if (queue.contains(key)) {
                queue.add(queue.remove());
            } else {
                queue.add(key);
            }
        }

        public V get(K key) throws Exception {
            if (!hashMap.containsKey(key)) {
                throw new Exception("not found");
            }
            queue.remove(key);
            queue.add(key);
            return hashMap.get(key);
        }


        public V remove(K key) throws Exception {
            if (!hashMap.containsKey(key)) {
                throw new Exception("not found");
            }
            queue.remove(key);
            return hashMap.remove(key);
        }

        public void evict() {
            if (!queue.isEmpty()) {
                K key = queue.poll();
                hashMap.remove(key);
            }

        }
    }
}
