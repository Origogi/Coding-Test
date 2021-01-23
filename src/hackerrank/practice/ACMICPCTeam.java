package hackerrank.practice;

public class ACMICPCTeam {
    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic) {

        int N = topic.length;
        int M = topic[0].length();

        int maxLength = 0;
        int maxLengthCount = 0;

        for (int i = 0;i< N;i++) {
            for (int j = i +1 ;j<N;j++) {
                int length = 0;

                for (int k = 0;k<M;k++) {
                    if (topic[i].charAt(k) == '1' || topic[j].charAt(k) == '1') {
                        length++;
                    }
                }

                if (length > maxLength) {
                    maxLength = length;
                    maxLengthCount = 1;
                } else if(length == maxLength) {
                    maxLengthCount++;
                }
            }
        }

        return new int[] {maxLength, maxLengthCount};
    }

}
