package hackerrank.practice

fun main() {
    gameOfThrones("cdcdcdcdeeeef")
}

// Complete the gameOfThrones function below.
fun gameOfThrones(s: String): String {


    return if (s.groupingBy { it }.eachCount().map { it.value }.filter { it % 2 == 1 }.size <= 1) "YES" else "NO"
}