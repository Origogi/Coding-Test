package codility.java.sort;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberOfDiscIntersections {

    public static void main(String[] args) {
        new NumberOfDiscIntersections().solution(new int[]{1,5,2,1,4,0});
    }


    class Disk implements Comparable<Disk> {
        int point = 0;
        long left = 0;
        long right = 0;

        public Disk(int point, int dist) {
            this.point = point;
            left = point - dist;
            right = point + dist;
        }

        @Override
        public int compareTo(Disk o) {
           long diff = ((right - left) - (o.right - o.left));

           if (diff <0) {
               return -1;
           } else if (diff >0){
               return 1;
           }
           return 0;
        }

        public boolean isAdj(Disk d) {
            if (left >= d.left && left <= d.right) {
                return true;
            }

            if (right >= d.left && right <= d.right) {
                return true;
            }
            return false;
        }
    }

    public int solution(int[] A) {

        List<Disk> list = IntStream
                .range(0, A.length)
                .mapToObj(i -> new Disk(i, A[i]))
                .sorted()
                .collect(Collectors.toList());

        int ans = 0;
        for (int i = 0;i< A.length -1;i++) {
            for (int j = i +1;j<A.length;j++) {
                if(list.get(i).isAdj(list.get(j))) {
                    ans++;

                    if (ans > 10000000) {
                        return -1;
                    }
                }
            }
        }
        return ans;
    }

}
