package codility.kotlin

class Triangle {

    fun solution(A: IntArray): Int {
        // write your code in Kotlin

        A.sort()

        for (i in 2 until A.size) {
            if (A[i] < A[i-1].toLong() + A[i-2].toLong()) {
                return 1
            }

        }
        return 0
    }

}