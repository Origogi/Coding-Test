package leetcode.string

fun firstUniqChar(s: String): Int {
    val target = s.asSequence()
        .groupingBy { it }
        .eachCount()
        .filter { it.value == 1 }
        .map { it.key }
        .getOrNull(0)

    return if (target == null) {
        -1
    } else {
        s.indexOf(target)
    }
}