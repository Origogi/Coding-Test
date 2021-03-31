package codility.kotlin

class TieRopes {

    fun solution(K: Int, A: IntArray): Int {
        var count = 0
        var current = 0L

        for ( a in A) {
            current += a
            if (current >= K) {
                current = 0
                count++
            }
        }
        return count
    }

}