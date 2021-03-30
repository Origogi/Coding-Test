package codility.kotlin

class Dominator {

    fun solution(A: IntArray): Int {
        var leader = A[0]
        var leaderCount = 1
        var leaderIndex = 0

        for (i in 1 until A.size) {
            if (leaderCount == 0) {
                leaderCount = 1
                leader = A[i]
                leaderIndex = i
            } else if (A[i] == leader) {
                leaderCount++
            } else {
                leaderCount--
            }
        }

        var count = 0
        for (a in A) {
            if (a == leader) {
                count++
            }
        }
        return if (count > A.size.toDouble() / 2) leaderIndex else -1

    }
}