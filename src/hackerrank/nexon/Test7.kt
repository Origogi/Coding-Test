package hackerrank.nexon

import kotlin.math.roundToInt


fun ways(total: Int, k: Int): Int {


    return (find(total, 1, k, /*mutableListOf()*/) % 1000000007).toInt()
}

fun find(remain : Int, base : Int, k :Int, /*list : List<Int>*/) : Long {
    if (remain == 0) {
//        println(list)
        return 1L
    }
    var ans = 0L
    for (i in base .. k) {
        val nextRemain = remain - i

        if (nextRemain >= 0) {
//            val nextList = list.toMutableList().apply {
//                add(i)
//            }
            ans += find(nextRemain, i, k,/* nextList*/)
        }
    }
    return ans
}



fun main() {
    print(ways(5, 3))
}