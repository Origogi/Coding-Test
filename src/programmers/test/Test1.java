package programmers.test;

public class Test1 {

    public static void main(String[] args) {
        new Test1().solution(3, 3, new String[]{"DBA", "C*A", "CDB"});
    }

    public String solution(int m, int n, String[] b) {

        char[][] board = new char[b.length][b[0].length()];

        int remainBlock = 0;

        for (int i = 0; i < board.length; i++) {
            char[] chars = b[i].toCharArray();
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = chars[j];
                if (board[i][j] != '*' && board[i][j] != '.') {
                    remainBlock++;
                }
            }
        }

        boolean find = false;
        while (remainBlock > 0) {
            find = false;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] != '*' && board[i][j] != '.') {
                        if(findPair(i, j, board)) {
                            find = true;
                            break;
                        }
                    }
                }

                if (find) {
                    break;
                }
            }

            if (!find) {
                break;
            }
        }


        String answer = "";
        return answer;
    }

    private boolean findPair(int x, int y, char[][] board) {
        char target = board[x][y];

        int[] pairX = {x, 0};
        int[] pairY = {y, 0};

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (pairX[0] == i && pairY[0] == j) {
                    continue;
                }

                if (board[i][j] == target) {
                    pairX[1] = i;
                    pairY[1] = j;
                }
            }
        }

        boolean impossible = false;

        if (pairX[0] > pairX[1]) {
            for (int i = 1 + pairX[1]; i < pairX[0]; i++) {

                if (board[i][pairY[1]] != '.') {
                    impossible = true;
                    break;
                }
            }
        } else if (pairX[1] > pairX[0]) {
            for (int i = 1 + pairX[0]; i < pairX[1]; i++) {

                if (board[i][pairY[0]] != '.') {
                    impossible = true;
                    break;
                }
            }
        }

        if (pairY[0] > pairY[1]) {
            for (int i = 1 + pairY[1]; i < pairY[0]; i++) {

                if (board[pairX[1]][i] != '.') {
                    impossible = true;
                    break;
                }
            }
        } else if (pairY[1] > pairY[0]) {
            for (int i = 1 + pairY[0]; i < pairY[1]; i++) {

                if (board[pairX[0]][i] != '.') {
                    impossible = true;
                    break;
                }
            }
        }

        if (!impossible) {
            board[pairX[0]][pairY[0]] = '.';
            board[pairX[1]][pairY[1]] = '.';
        }

        return !impossible;

    }

}
