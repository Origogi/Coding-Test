package hackerrank.practice

fun main() {
    println(gridChallenge(arrayOf("mpxz", "abcd", "wlmf")))
}

fun gridChallenge(grid: Array<String>): String {

    for (i in grid.indices) {
        grid[i] = grid[i].toCharArray().let {
            it.sort()
            it.joinToString ("")
        }
    }

    for (i in grid[0].indices) {
        for (j in 0 until grid.size -1) {
            if (grid[j][i] > grid[j +1][i]) {
                return "NO"
            }
        }
    }
    return "YES"
}