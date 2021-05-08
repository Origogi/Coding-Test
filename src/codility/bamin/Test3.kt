package codility.bamin

class Test3 {


    fun solution(A: IntArray): Int {
        var ans = 0

        val set = mutableSetOf<Int>()
        for (a in A) {
            var b = a * -1
            if (set.contains(b)) {
                ans = Math.max(ans, Math.abs(a))
            }
            set += a

        }
        return ans
    }

}