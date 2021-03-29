package hackerrank.practice



fun missingNumbers(arr: Array<Int>, brr: Array<Int>): Array<Int> {
    val bMap = brr.groupingBy { it }.eachCount().toMutableMap()

    for (a in arr) {
        bMap[a] = bMap[a]!! - 1
    }

    val result = bMap.filter { it.value > 0 }.map { it.key }

    return result.toTypedArray().apply { sort() }

}