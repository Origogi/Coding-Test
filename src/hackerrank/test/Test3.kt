package hackerrank.test

import java.lang.StringBuilder

fun main() {
    println(minOperations(13))
}
fun minOperations(N: Long): Long {

    var ans = 1L
    var target = 1L
    var level = 1L
    var upperBound = 1L

    while (true) {
        level *=2
        target++
        upperBound += level
        ans = upperBound

        if (target == N) {
            break
        }

        for (i in 1 until level) {
            ans--
            target++

            if (target == N) {
                break
            }
        }

        if (target == N) {
            break
        }
    }
    return ans
}
