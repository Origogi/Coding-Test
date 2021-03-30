package codility.kotlin

class MaxProductOfThree {

    fun solution(A: IntArray): Int {
        // write your code in Kotlin
        return A.sort().let {
            val N = A.size
            Math.max(A[N-3] * A[N -2] * A[N-1] , A[0] * A[1] * A[N-1])
        }

    }
}