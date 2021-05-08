fun main() {
    solution(1, 10000, intArrayOf(0, 10000, 0))
}

fun solution(K: Int, M: Int, A: IntArray): Int {
    // write your code in Kotlin

    var min = A.maxOrNull()?:0
    var max = A.sum()

    var ans = 0

    while (min <= max) {
        var k = K - 1
        var target = (min + max) / 2

        var sum = 0

        for (i in A.indices) {
            if (A[i] > target) {
                k = -1
                break
            }

            if (sum + A[i] > target) {
                sum = A[i]
                k--
            } else {
                sum += A[i]
            }
        }

        if (k < 0) {
            min = target + 1
        } else {
            max = target - 1
            ans = target
        }
    }
    return ans
}
