package leetcode.exercise

fun searchInsert(nums: IntArray, target: Int): Int {
    return binarySearch(0, nums.size -1 ,nums , target)

}

fun binarySearch(start : Int, end : Int, nums: IntArray, target: Int) : Int {

    if (start > end) {
        return start
    }

    val midIdx = (start + end) / 2

    if (nums[midIdx] == target) {
        return midIdx
    }

    if (nums[midIdx] > target) {
        return binarySearch(start, midIdx -1 , nums, target)
    } else {
        return binarySearch(midIdx +1, end , nums, target)
    }
}