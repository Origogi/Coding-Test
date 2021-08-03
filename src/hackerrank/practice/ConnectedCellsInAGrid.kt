package hackerrank.practice

import java.util.*

fun connectedCell(matrix: Array<Array<Int>>): Int {
    val M = matrix.size
    val N = matrix[0].size

    val visited = Array(M) { m ->
        Array(N) { n ->
            matrix[m][n] == 0
        }
    }


    var ans = 0

    for (i in 0 until M) {
        for (j in 0 until N) {
            if (!visited[i][j]) {
                ans = Math.max(find(i, j, visited), ans)
            }
        }
    }

    return ans

}

fun find(x: Int, y: Int, visited: Array<Array<Boolean>>): Int {

    val M = visited.size
    val N = visited[0].size

    val queue = LinkedList<Pair<Int, Int>>().apply {
        add(Pair(x, y))
    }
    visited[x][y] = true

    var ans = 0

    val moveX = arrayOf(0, 0, 1, -1, 1, -1, 1, -1)
    val moveY = arrayOf(1, -1, 0, 0, 1, -1, -1, 1)

    while (queue.isNotEmpty()) {
        val current = queue.removeFirst()
        ans++

        IntRange(0, 7).map {
            Pair(current.first + moveX[it], current.second + moveY[it])
        }.filter {
            it.first in 0 until M
                    && it.second in 0 until N
                    && !visited[it.first][it.second]
        }.forEach {
            visited[it.first][it.second] = true
            queue.add(it)
        }
    }

    return ans
}