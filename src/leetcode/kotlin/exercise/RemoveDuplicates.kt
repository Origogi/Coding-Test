package leetcode.exercise

fun removeDuplicates(nums: IntArray): Int {

    if (nums.size <= 1) {
        return nums.size
    }

    var targetIdx = 1
    var currentValue = nums[0]

    for (i in 1 until nums.size ) {
        if (currentValue != nums[i]) {
            nums[targetIdx] = nums[i]
            currentValue = nums[targetIdx]

            targetIdx++
        }
    }


    return targetIdx

}