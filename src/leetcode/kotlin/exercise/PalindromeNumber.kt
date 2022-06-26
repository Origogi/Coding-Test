package leetcode.exercise

fun isPalindrome(x: Int): Boolean {
    val str = x.toString()

    var left =0
    var right = str.length -1

    while (left < right) {
        if (str[left++] != str[right--]) {
            return false
        }
    }
    return true

}