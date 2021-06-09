package hackerrank.practice

fun migratoryBirds(arr: Array<Int>): Int {
    // Write your code here

    val map = arr.groupingBy { it }.eachCount()

    val maxCount = map.values.max()

    var ans = Int.MAX_VALUE

    for (entry in map) {
        if (entry.value == maxCount) {
            if (ans > entry.key) {
                ans = entry.key
            }
        }
    }
    return ans
}