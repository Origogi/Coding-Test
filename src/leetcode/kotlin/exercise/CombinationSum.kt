package leetcode.exercise

fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    dfs(candidates, target, listOf<Int>(), result)
    return result
}

fun dfs(candidates: IntArray, remain : Int, current : List<Int>, result : MutableList<List<Int>>) {
    if (remain <= 0) {
        if (remain == 0) {
            result.add(current)
        }
        return
    }

    for (i in candidates.indices) {
        if (current.isEmpty() || candidates[i] >= current.last()) {

            dfs(candidates, remain - candidates[i], current + candidates[i] , result)
        }


    }
}