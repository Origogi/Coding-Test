package codility.kotlin

class PermMissingElem {
    fun solution(A: IntArray): Int {
        // write your code in Kotlin
        val N = (A.size +1).toLong()

        var sum = (N * (N +1))/ 2

        for (a in A) {
            sum -= a.toLong()
        }

        return sum.toInt()
    }

}

