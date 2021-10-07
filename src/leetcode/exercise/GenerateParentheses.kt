package leetcode.exercise

fun generateParenthesis(n: Int): List<String> {
    val result = mutableListOf<String>()
    find(n,n,"", result)
    return result
}

fun find(remainL : Int, remainR : Int, current : String, result : MutableList<String>) {
    if (remainL == 0 && remainR == 0) {
        result.add(current)
        return
    } else if (remainL < 0 || remainR < 0 || remainL > remainR) {
        return
    }

    find(remainL -1, remainR, "$current(", result)
    find(remainL, remainR -1, "$current)", result)

}