package codility.kotlin

class MaxDoubleSliceSum {

    fun solution(A: IntArray): Int {
        // write your code in Kotlin
        val prefixSumL = arrayOfNulls<Int>(A.size).apply { this[0] = 0 }
        val prefixSumR = arrayOfNulls<Int>(A.size).apply { this[A.size - 1] = 0 }

        for (i in 1 until A.size - 1) {
            prefixSumL[i] = Math.max(0, prefixSumL[i -1]!! + A[i])
        }

        for (i in A.size - 2 downTo 1) {
            prefixSumR[i] = Math.max(0, prefixSumR[i+1]!! + A[i])
        }

        var result = 0

        for (i in 1 until A.size -1) {
            result = Math.max(prefixSumL[i -1]!! + prefixSumR[i+1]!!, result)
        }
        return result
    }

}