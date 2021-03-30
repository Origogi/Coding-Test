package codility.kotlin

class MinAvgTwoSlice {

    fun solution(A: IntArray): Int {
        // write your code in Kotlin

        var lowIndex = 0
        var lowSlice = (A[0] + A[1]).toDouble() / 2

        for (i in 2 until A.size) {
            val avg3 = getAvg(A[i - 2], A[i - 1], A[i])

            if (avg3 < lowSlice) {
                lowIndex = i - 2
                lowSlice = avg3
            }

            val avg2 = getAvg(A[i - 1], A[i])
            if (avg2 <

                    lowSlice) {
                lowIndex = i - 1
                lowSlice = avg2
            }

        }

        return lowIndex

    }

    private fun getAvg(vararg values: Int): Double {
        return values.sum().toDouble() / values.size.toDouble()
    }
}