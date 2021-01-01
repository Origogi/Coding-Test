package codility_temp.lesson1;

public class BinaryGap {



    public static void main(String[] args) {

        int value = 1041 ;
        BinaryGap gap = new BinaryGap();
        System.out.println(gap.solution1(value));
    }

    public int solution1(int value) {

        int maxCount  = 0;
        int currentCount = 0;
        boolean startCount = false;
        while (value > 0) {
            if (value % 2 == 1) {
                startCount = true;
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 0;
            }
            else {
                if (startCount) {
                    currentCount++;
                }
            }
            value = value /2;
        }

        return maxCount;
    }

    public int solution2(int value) {
        String binaryStr = Integer.toBinaryString(value);

        int ans  = 0;
        int temp = 0;
        for (char c : binaryStr.toCharArray()) {
            if (c == '1') {
                if (temp > ans) {
                    ans = temp;
                }
                temp = 0;
            }
            else {
                temp++;
            }
        }
        return ans;
    }
}
