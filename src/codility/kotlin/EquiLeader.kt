package codility.kotlin

class EquiLeader {
    fun solution(A: IntArray): Int {
        var leader = 0
        var leaderCount = 0

        for (i in A.indices) {
            if (leaderCount == 0) {
                leaderCount = 1
                leader = A[i]
            } else if (A[i] == leader) {
                leaderCount++
            } else {
                leaderCount--
            }
        }

        var countL = 0
        var countR = 0
        var sizeL = 0
        var sizeR = A.size
        for (a in A) {
            if (a == leader) {
                countR++
            }
        }

        var result = 0

        for (i in 0 until A.size -1) {
            sizeL++
            sizeR--

            if (A[i] == leader) {
                countL++
                countR--
            }

            if ( (countL.toDouble() / sizeL.toDouble() > 0.5) && (countR.toDouble() / sizeR.toDouble() > 0.5)) {
                result++
            }
        }
        return result
    }
}