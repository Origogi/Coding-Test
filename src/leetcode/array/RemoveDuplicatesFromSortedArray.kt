package leetcode.array

class Solution {
    fun removeDuplicates(nums: IntArray): Int {

        var targetIdx = 1

        for (i in 1 until nums.size) {
            val value = nums[i]

            if (nums[targetIdx -1] != value) {
                nums[targetIdx] = value
                targetIdx++
            }
        }

        return targetIdx
    }
}