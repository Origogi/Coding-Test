package leetcode.exercise



fun removeElement(nums: IntArray, `val`: Int): Int {

    var targetIdx = 0
    for (i in nums.indices) {
        if (nums[i] != `val`) {
            nums[targetIdx++] = nums[i]
        }
    }
    return targetIdx

}