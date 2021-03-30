package codility.kotlin

fun main() {
}

fun solution(X: Int, Y: Int, D: Int): Int {
    // write your code in Kotlin
    return Math.ceil((D - X).toDouble() / Y).toInt()
}
