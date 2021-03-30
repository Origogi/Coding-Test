package codility.kotlin

class FrogRiverOne {

    fun solution(X: Int, A: IntArray): Int {
        // write your code in Kotlin

        val set = mutableSetOf<Int>()

        for (i in A.indices) {
            set.add(A[i])
            if (set.size == X) {
                return i
            }
        }
        return -1

    }

}