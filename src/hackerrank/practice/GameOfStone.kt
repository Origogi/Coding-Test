package hackerrank.practice

fun main() {
    listOf(1, 2, 3, 4, 5, 6, 7, 10).map { gameOfStones(it) }.forEach { println(it) }
}

fun gameOfStones(N: Int): String {
    val memory = arrayOfNulls<String>(101)
    return winner(N, memory)
}

fun winner(n: Int, memory: Array<String?>): String {

    if (n == 1) {
        return "Second"
    } else if (n in 2..6) {
        return "First"
    }

    if (memory[n] == null) {
        if (winner(n - 5, memory) == "First"
            && winner(n - 3, memory) == "First"
            && winner(n - 2, memory) == "First") {
            memory[n] = "Second"
        } else {
            memory[n] = "First"
        }
    }

    return memory[n]!!
}


