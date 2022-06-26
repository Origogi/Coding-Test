package leetcode.exercise

import java.util.*

fun isValid(s: String): Boolean {
    val map = mapOf('(' to ')',
        '{' to '}',
        '[' to ']')

    val stack = Stack<Char>()

    for ( c in s) {
        if ( c in map.keys) {
            stack.push(c)
        } else {
            if (stack.isEmpty()) {
                return false
            }
            val top = stack.pop()

            if (c != map[top]) {
                return false
            }
        }
    }

    return stack.isEmpty()
}