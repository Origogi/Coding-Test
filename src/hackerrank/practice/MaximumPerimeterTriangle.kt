package hackerrank.practice

fun maximumPerimeterTriangle(sticks: Array<Int>): Array<Int> {
    sticks.sort()

    var ans = arrayOf(-1)

    for (i in 0 until  sticks.size -2) {
        if (sticks[i + 2] < sticks[i + 1] + sticks[i]) {
            ans = arrayOf(sticks[i], sticks[i+1], sticks[i +2])
        }
    }
    return ans
}