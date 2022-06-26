package leetcode.array

fun containsDuplicate(nums: IntArray): Boolean {
    val set = mutableSetOf<Int>()
    for (n in nums) {
        if (!set.add(n)) {
            return true
        }
    }
    return false
}
