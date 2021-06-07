package hackerrank.practice

fun plusMinus(arr: Array<Int>): Unit {
    val ans = arrayOf(0,0,0)

    for (a in arr) {
        when {
            a > 0 -> ans[0]++
            a < 0 -> ans[1]++
            else -> ans[2]++
        }
    }

    ans.forEach {
        println(String.format("%.5f", it.toFloat() /arr.size))
    }
}