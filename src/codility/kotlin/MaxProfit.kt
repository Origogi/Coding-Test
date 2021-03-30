package codility.kotlin

fun main() {

}

class MaxProfit {

    fun solution(A: IntArray): Int {
        // write your code in Kotlin

        if (A.isEmpty()) {
            return 0
        }

        var buy = A[0]
        var maxProfit = 0

        for ( i in 1 until A.size) {
            if (A[i] < buy) {
                buy = A[i]
            } else {
                maxProfit = Math.max(maxProfit, A[i] - buy)
            }

        }
        return maxProfit

    }
}