package hackerrank.practice

import java.util.*

fun minimumLoss(price: Array<Long>): Int {

    val sortedArray = price.sortedArray()

    var ans = Long.MAX_VALUE

    val map = price.mapIndexed { i, v ->
        v to i
    }.toMap()

    for (i in 0 until price.size - 1) {
        if (map[sortedArray[i]]!! > map[sortedArray[i + 1]]!!) {
            ans = Math.min(ans, (sortedArray[i + 1] - sortedArray[i]))
        }
    }
    return ans.toInt()
}

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    val n = sc.nextInt()

    val price = Array(n) {
        sc.nextLong()
    }

    sc.close()

    val result = minimumLoss(price)

    println(result)
}
