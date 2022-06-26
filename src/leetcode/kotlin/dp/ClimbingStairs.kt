package leetcode.dp

class Solution {

    val memory = IntArray(46) {
        0
    }

    fun climbStairs(n: Int): Int {
        if (n <=2) {
            return n
        }

        if (memory[n] !=0) {
            return memory[n]
        }

        val result = climbStairs(n -1) + climbStairs(n -2)
        memory[n] = result
        return result
    }
}