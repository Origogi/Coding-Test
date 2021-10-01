package leetcode.dp

fun rob(nums: IntArray): Int {

    val prefix = IntArray(3) {
        0
    }

    for (i in nums.indices) {
        prefix[2] = Math.max(prefix[0] + nums[i], prefix[1])
        prefix[0] = prefix[1]
        prefix[1] = prefix[2]
    }
    return prefix[2]
}