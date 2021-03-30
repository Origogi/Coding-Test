package codility.kotlin

fun main() {
    PassingCars().solution(intArrayOf(0,1,0,1,1))
}

class PassingCars {



    fun solution(A: IntArray): Int {
        // write your code in Kotlin
        var result = 0
        var westCarCount = 0

        for (i in A.size - 1 downTo 0) {
            if (A[i] == 1) {
                westCarCount++
            } else {
                result += westCarCount
                if (result > 1_000_000_000) {
                    return -1
                }
            }
        }
        return result
    }

}