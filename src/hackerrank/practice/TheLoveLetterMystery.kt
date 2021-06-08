package hackerrank.practice

fun theLoveLetterMystery(s: String): Int {
    var left = 0
    var right = s.length -1

    var ans = 0

    while (left < right) {
        ans += Math.abs(s[left] - s[right])
        left++
        right--
    }
    return ans

}
