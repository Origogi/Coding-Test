package leetcode.array

fun moveZeroes(nums: IntArray): Unit {
    var index = 0

    for (n in nums) {
        if (n != 0) {
            nums[index] = n
            index++
        }
    }

    for (i in index until nums.size) {
        nums[i] = 0
    }
}