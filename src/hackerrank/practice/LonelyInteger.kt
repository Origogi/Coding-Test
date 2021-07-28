package hackerrank.practice

fun lonelyinteger(a: Array<Int>): Int {
    return a.reduce { a, b -> a xor b  }
}
