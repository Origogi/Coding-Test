package codility.kotlin

class MaxSliceSum {
    fun solution(A: IntArray): Int {
        var currentSum = A[0]
        var maxSum = A[0]

        for (i in 1 until A.size) {
            if (currentSum + A[i] > A[i]) {
                currentSum += A[i]
            } else {
                currentSum = A[i]
            }
            maxSum = Math.max(currentSum, maxSum)
        }
        return maxSum
    }

}