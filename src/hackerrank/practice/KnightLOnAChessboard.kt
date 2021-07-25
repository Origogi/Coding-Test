package hackerrank.practice

import java.util.*

fun main() {
    knightlOnAChessboard(5)
}

fun knightlOnAChessboard(n: Int): Array<Array<Int>> {
    // Write your code here

    val ans = Array(n - 1) {
        Array(n - 1) {
            0
        }
    }

    for (i in 1 until n) {
        for (j in 1 until n) {
            if (ans[i - 1][j - 1] == 0) {
                val result = find(i, j, n)
                ans[i - 1][j - 1] = result
                ans[j - 1][i - 1] = result
            }

        }
    }

    return ans
}


fun find(i: Int, j: Int, n: Int): Int {
    val map = Array(n) {
        Array(n) {
            -1
        }
    }

    map[0][0] = 0

    val queue = LinkedList<Triple<Int, Int, Int>>().apply {
        add(Triple(0, 0, 0))
    }

    while (queue.isNotEmpty() && map[n - 1][n - 1] == -1) {
        val point = queue.remove()


        val moveX = arrayOf(i, i, -i, -i, j, j, -j, -j)
        val moveY = arrayOf(j, -j, j, -j, i, -i, i, -i)

        for (i in 0..7) {
            val nextX = point.first + moveX[i]
            val nextY = point.second + moveY[i]

            if (nextX >= 0 && nextX <= n - 1 && nextY >= 0 && nextY <= n - 1) {
                if (map[nextX][nextY] == -1) {
                    queue.add(Triple(nextX, nextY, point.third + 1))
                    map[nextX][nextY] = point.third + 1
                }
            }
        }
    }

    return map[n - 1][n - 1]
}