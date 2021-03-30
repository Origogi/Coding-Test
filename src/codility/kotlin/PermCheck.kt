package codility.kotlin

class PermCheck {

    fun solution(A: IntArray): Int {
        val set = A.toHashSet()

        for (i in 1..A.size) {
            if (!set.contains(i)) {
                return 0
            }

        }
        return 1
    }

}