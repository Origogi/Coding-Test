package codility.kotlin

import kotlin.math.absoluteValue

fun main() {
    TapeEquilibrium().solution(intArrayOf(-1,1))
}

class TapeEquilibrium {

    fun solution(A: IntArray): Int {
        // write your code in Kotlin
        var diff = Long.MAX_VALUE

        var left : Long = 0L
        var right : Long = A.map { it.toLong() }.sum()

        for (i in 0.. A.size -2) {
            left += A[i]
            right -= A[i]
            diff = Math.min(diff, (left - right).absoluteValue)
        }

        return diff.toInt()
    }

}