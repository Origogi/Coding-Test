package hackerrank.practice


fun main(args: Array<String>) {
    val q = readLine()!!.trim().toInt()

    for (qItr in 1..q) {
        val first_multiple_input = readLine()!!.trimEnd().split(" ")

        val n = first_multiple_input[0].toInt()

        val k = first_multiple_input[1].toInt()

        val A = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

        val B = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

        val result = twoArrays(k, A, B)

        println(result)
    }
}

fun twoArrays(k: Int, A: Array<Int>, B: Array<Int>): String {
    // Write your code here

    val bMap = B.groupingBy { it }.eachCount().toMutableMap()

    for (a in A) {
        var target = -1

        for ( b in bMap.keys) {
            if (a + b >= k && (target == -1 || target > b )) {
                target = b
            }
        }

        if (target != -1) {
            val count = bMap[target]!! - 1
            if (count == 0) {
                bMap.remove(target)
            } else {
                bMap[target] = count
            }
        } else {
            return "NO"
        }
    }
    return "YES"

}
