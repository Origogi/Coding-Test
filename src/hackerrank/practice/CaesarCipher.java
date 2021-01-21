package hackerrank.practice;

public class CaesarCipher {
    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {

        StringBuffer sb = new StringBuffer();

        k %= 26;

        for (char c : s.toCharArray()) {
            if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')) {
                char shift = (char) (c + k);
                if (('a' <= c && c <= 'z') ) { //lower case
                    if (shift > 'z') {
                        shift = (char)(shift - 26);
                    }
                } else {  // upper case
                    if (shift > 'Z') {
                        shift = (char)(shift - 26);
                    }
                }

                sb.append(shift);
            } else {
                sb.append(c);

            }
        }
        return sb.toString();
    }

}
