package codility.kotlin

import java.util.*

class Brackets {

    fun solution(S: String): Int {
        // write your code in Kotlin

        val stack = Stack<Char>()

        val map = mapOf<Char, Char>('{' to '}', '(' to ')', '[' to ']')

        for (c in S) {
            if (c == '{' || c == '[' || c =='(') {
                stack.add(c)
            } else {
                if (stack.isEmpty()) {
                    return 0
                }

                val top = stack.pop()
                if (map[top] != c) {
                    return 0
                }

            }
        }

        return if (stack.empty()) 1 else 0
    }

}