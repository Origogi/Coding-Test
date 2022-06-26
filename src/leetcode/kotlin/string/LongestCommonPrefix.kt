package leetcode.string

fun longestCommonPrefix(strs: Array<String>): String {
    var i = 0

    while (i < strs[0].length) {
        val target = strs[0][i]
        var isPrefix = true

        for (j in 1 until strs.size) {
            if (i >= strs[j].length || strs[j][i] != target) {
                isPrefix = false
                break
            }
        }

        if (!isPrefix) {
            break
        }
        i++

    }

    return strs[0].substring(0,i)
}