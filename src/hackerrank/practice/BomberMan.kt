package hackerrank.practice

fun main() {
    val ans = bomberMan(
        2,
        arrayOf(
            ".......",
            "...O.O.",
            "....O..",
            "..O....",
            "OO...OO",
            "OO.O..."
        )
    )

    for (a in ans) {
        println(a)
    }
}

fun bomberMan(n: Int, grid: Array<String>): Array<String> {
    // Write your code here

    return when {
        n == 1 -> {
            grid
        }
        n % 2 == 0 -> {
            Array(grid.size) {
                var str = ""
                repeat(grid[0].length) {
                    str += "0"
                }
                str
            }
        }
        ( (n -1) / 2) % 2 == 0 -> {
            placeBomb(placeBomb(grid))

        }
        else -> {
            placeBomb(grid)
        }
    }
}

fun placeBomb(grid: Array<String>) : Array<String> {
    val bombMap = Array(grid.size) {
        Array(grid[0].length) {
            true
        }
    }

    val ans = Array(grid.size) {
        ""
    }

    val moveX = arrayOf(0, 0, 1, -1)
    val moveY = arrayOf(1, -1, 0, 0)

    for (i in grid.indices) {
        for (j in grid[i].indices) {
            if (grid[i][j] == 'O') {
                for (k in 0..3) {
                    val nextX = i + moveX[k]
                    val nextY = j + moveY[k]

                    bombMap[i][j] = false

                    if (nextX in grid.indices &&
                        nextY in grid[i].indices
                    ) {
                        bombMap[nextX][nextY] = false
                    }
                }
            }
        }
    }

    for (i in bombMap.indices) {
        for (j in bombMap[i].indices) {
            ans[i] += if (bombMap[i][j]) {
                "O"
            } else {
                "."
            }
        }
    }
    return ans
}
