package leetcode.exercise

fun permute(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()

    makePermute(nums.toList(), listOf<Int>(), result)

    return result
}

fun makePermute(remainNums : List<Int>, currentNums : List<Int>, result : MutableList<List<Int>>) {
    if (remainNums.isEmpty()) {
        result.add(currentNums)
        return
    }

    for (i in remainNums.indices) {

        val nextItem = remainNums[i]
        val nextRemainNums = remainNums.toMutableList().apply {
            removeAt(i)
        }
        val nextNums = currentNums.toMutableList().apply {
            add(nextItem)
        }

        makePermute(nextRemainNums, nextNums, result)
    }
}