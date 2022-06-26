package leetcode.string

private class Solution {
    fun isPalindrome(s: String): Boolean {

        val str = s.replace("[^0-9a-zA-Z]".toRegex(), "").toLowerCase()

        var left = 0
        var right = str.length - 1

        while (left <= right) {
            if (str[left++] != str[right--]) {
                return false
            }
        }

        return true

    }
}