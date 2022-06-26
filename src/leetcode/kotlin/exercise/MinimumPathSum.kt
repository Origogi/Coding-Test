package leetcode.exercise

fun minPathSum(grid: Array<IntArray>): Int {
    val (m, n) = grid[0].size to grid.size

    val pathSums =  Array(n) {
        Array(m) {
            Integer.MAX_VALUE
        }
    }

    pathSums[0][0] = grid[0][0]

    val queue = LinkedList<Pair<Int, Int>>().apply {
        add(0 to 0)
    }


    val moveX = arrayOf(0, 1)
    val moveY = arrayOf(1, 0)

    while(queue.isNotEmpty()) {
        val current = queue.removeAt(0)

        repeat(2) { i ->
            val nextY = current.first + moveY[i]
            val nextX = current.second + moveX[i]

            if (nextX in 0 until m && nextY in 0 until n) {

                val pathSum = pathSums[current.first][current.second] + grid[nextY][nextX]

                if (pathSums[nextY][nextX] > pathSum) {
                    pathSums[nextY][nextX] = pathSum
                    queue.add(nextY to nextX)
                }
            }
        }
    }

    return pathSums[n -1][m -1]


}