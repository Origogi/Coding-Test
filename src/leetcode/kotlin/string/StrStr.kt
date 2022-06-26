package leetcode.string

fun strStr(haystack: String, needle: String): Int {
    if (needle.isEmpty()) {
        return 0
    }

    for (i in haystack.indices) {
        if (haystack[i] == needle[0]) {
            var index = i

            while (index < haystack.length
                && index -i < needle.length
                && needle[index -i] == haystack[index]) {
                index++
            }


            if (index - i == needle.length) {
                // find
                return i
            }
        }
    }

    return -1
}