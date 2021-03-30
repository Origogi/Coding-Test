package codility.kotlin

class MissingInteger {

    fun solution(A: IntArray): Int {
        val set = A.toHashSet()

        var result = 1
        while(true) {
            if (!set.contains(result)) {
                break;
            }
            result++
        }
        return result
    }
}