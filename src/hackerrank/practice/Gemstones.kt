package hackerrank.practice

fun main() {
}

// Complete the gemstones function below.
fun gemstones(arr: Array<String>): Int {

    val arrSet = arr.map { str -> str.toCharArray().toSet() }

    var ans = 0
    for (c : Char in arrSet[0]) {
        var contains = true
        for (i in 1 until arrSet.size) {
            if (!arrSet[i].contains(c)) {
                contains = false
                break
            }
        }

        if (contains) {
            ans++
        }
    }
    return ans
}