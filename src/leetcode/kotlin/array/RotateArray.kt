package leetcode.array

fun rotate(nums: IntArray, K: Int): Unit {

    val k = K % nums.size

    reverse(0, nums.size - 1, nums)
    reverse(0, k - 1, nums)
    reverse(k, nums.size - 1, nums)
}

fun reverse(s: Int, e: Int, nums: IntArray) {
    var start = s
    var end = e

    while (start < end) {

        val temp = nums[start]
        nums[start] = nums[end]
        nums[end] = temp

        start++
        end--

    }

}
