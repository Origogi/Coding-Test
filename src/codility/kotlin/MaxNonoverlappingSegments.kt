package codility.kotlin

class MaxNonoverlappingSegments {

    fun solution(A: IntArray, B: IntArray): Int {
        if (A.isEmpty()) {
            return 0
        }

        var count = 1
        var currentEnd = B[0]

        for (i in 1 until A.size) {
            if (currentEnd < A[i]) {
                count++
                currentEnd = B[i]
            }
        }

        return count
    }
}