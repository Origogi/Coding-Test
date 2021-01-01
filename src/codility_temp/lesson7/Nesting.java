package codility_temp.lesson7;

public class Nesting {

    public int solution(String S) {
        int stack = 0;

        for (char c : S.toCharArray()) {
            if (c =='(') {
                stack++;
            }
            else {
                if (stack == 0) {
                    return 0;
                }
                else {
                    stack--;
                }
            }
        }

        return stack == 0 ? 1:0;
    }
}
