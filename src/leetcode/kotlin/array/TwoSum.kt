package leetcode.array

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = nums.mapIndexed { i, a ->
        a to i
    }.toMap()

    println(map.toString())

    for (i in nums.indices) {

        val opposite = map[target - nums[i]]

        if (opposite != null && opposite != i) {
            return intArrayOf(i, opposite )
        }
    }
    return IntArray(0)
}