package hackerrank.practice

// Complete the anagram function below.

fun main() {
    anagram("aaab")
}

fun anagram(s: String): Int {

    val N = s.length

    if (N % 2 == 1) {
        return -1
    }

    val map = s.substring(0, N / 2).groupingBy { it }.eachCount().toMutableMap()

    for (i in N / 2 until N) {
        map[s[i]] = map[s[i]]?.let { count -> count - 1 } ?: 0
    }

    val ans=  map.map { it.value }.filter { it > 0 }.sum()
    return ans
}