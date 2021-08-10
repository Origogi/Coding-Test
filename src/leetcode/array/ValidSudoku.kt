package leetcode.array

fun isValidSudoku(board: Array<CharArray>): Boolean {
    for (i in 0 until 3) {
        for (j in 0 until 3) {
            if (!checkSqr(board,3 * i, 3 * j)) {
                return false
            }
        }
    }

    for (i in 0 until 9) {
        if (!checkRow(board,i)) {
            return false
        }
    }

    for (i in 0 until 9) {
        if (!checkCol(board,i)) {
            return false
        }
    }

    return true
}

fun checkSqr(board: Array<CharArray>, x : Int, y : Int) : Boolean {
    val set = mutableSetOf<Char>()

    for (i in 0 until 3) {
        for (j in 0 until 3) {
            if (board[x + i][y + j] != '.') {
                if (!set.add(board[x + i][y + j])) {
                    return false
                }
            }
        }
    }
    return true
}

fun checkRow(board: Array<CharArray>, x : Int) : Boolean {
    val set = mutableSetOf<Char>()

    for (c in board[x]) {
        if (c != '.' && !set.add(c)) {
            return false
        }
    }
    return true
}

fun checkCol(board: Array<CharArray>, y : Int)  : Boolean {
    val set = mutableSetOf<Char>()

    for (i in 0 until 9) {
        if (board[i][y] != '.' && !set.add(board[i][y])) {
            return false
        }
    }
    return true
}