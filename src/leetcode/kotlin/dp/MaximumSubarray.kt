package leetcode.dp

fun maxSubArray(nums: IntArray): Int {

    var i = 0
    var sum = nums[0]
    var max = sum

    while(++i < nums.size) {
        sum = Math.max(sum + nums[i], nums[i])
        max = Math.max(sum, max)
    }
    return max

}