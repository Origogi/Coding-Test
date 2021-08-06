package hackerrank.practice

fun marcsCakewalk(calorie: Array<Int>): Long {
    calorie.sortDescending()

    var ans : Long = calorie[0].toLong()

    var b = 2L
    for (i in 1 until calorie.size) {
        ans += b * calorie[i]
        b *= 2
    }
    return ans
}