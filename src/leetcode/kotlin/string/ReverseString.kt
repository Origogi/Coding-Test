package leetcode.string

fun reverseString(s: CharArray): Unit {
    for (i in 0 until s.size /2) {
        // swap
        val temp = s[i]
        s[i] = s[s.size - 1 - i]
        s[s.size - 1 - i] = temp
    }
}