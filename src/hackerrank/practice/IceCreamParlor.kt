package hackerrank.practice

// Complete the icecreamParlor function below.
fun icecreamParlor(m: Int, arr: Array<Int>): Array<Int> {

    val map = arr.groupingBy { it }.eachCount().toMutableMap()

    var costs = mutableListOf<Int>()

    for (a in arr) {
        map[a] = map[a]!! - 1

        if (map.getOrDefault(m - a, 0) != 0) {
            costs.apply {
                add(a)
                add(m -a)
            }
            break
        }
        map[a] = map[a]!! + 1
    }

    val a = getIndex(arr, costs[0], 0)
    val b = getIndex(arr , costs[1], a)

    return arrayOf<Int>(a, b).apply {
        sort()
    }
}

fun getIndex(arr: Array<Int>, c: Int, startIndex : Int): Int {

    for (i in startIndex until  arr.size) {
        if (arr[i] == c) {
            return i + 1
        }
    }
    return -1

}
