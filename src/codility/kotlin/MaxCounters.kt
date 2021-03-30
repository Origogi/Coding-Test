package codility.kotlin

import java.util.stream.IntStream

fun main() {
    MaxCounters().solution(5, intArrayOf(3,4,4,6,1,4,4))
}

class MaxCounters {

    fun solution(N: Int, A: IntArray): IntArray {
        // write your code in Kotlin

        val result = mutableListOf<Int>().apply {
            for (i in 0 until N) {
                this.add(0)
            }
        }

        var base = 0
        var top = 0

        for (a in A) {
            if (a == N +1) {
                base = top
            } else {
                val target = (if (result[a-1] > base) result[a-1] else base) + 1
                result[a-1] = target

                top = Math.max(target, top)
            }
        }

        for (i in result.indices) {
            result[i] = if (result[i] > base) result[i] else base
        }
        return result.toIntArray()
    }
}