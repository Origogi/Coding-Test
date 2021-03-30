package codility.kotlin

import java.util.*

class Fish {

    fun solution(A: IntArray, B: IntArray): Int {
        val stack = Stack<Int>()

        var result = 0

        for (i in A.indices) {
            if (B[i] == 0) {

                while (stack.isNotEmpty() && stack.peek() < A[i]) {
                    stack.pop()
                }

                if (stack.isEmpty()) {
                    result++
                }

            } else {
                stack.push(A[i])
            }

        }

        return result + stack.size
    }

}