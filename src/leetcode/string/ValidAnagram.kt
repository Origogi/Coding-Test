package leetcode.string

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) {
        return false
    }

    val memory = IntArray(26) {0}

    for (i in s.indices) {
        memory[s[i] - 'a']++
        memory[t[i] - 'a']--
    }

    for (m in memory) {
        if (m !=0) {
            return false
        }
    }

    return true

}