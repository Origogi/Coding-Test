package hackerrank.practice

import java.util.*

fun largestPermutation(k: Int, arr: Array<Int>): Array<Int> {

    var target = arr.size

    var remain = k

    var start = 0

    while (remain > 0 && target > 0) {

        if (target != arr[start]) {
            swap(start = start, target = target, arr = arr)
            remain--
        }
        target--
        start++
    }

    return arr
}

fun swap(start: Int, target: Int, arr: Array<Int>) {
    for (i in start + 1 until arr.size) {
        if (arr[i] == target) {
            val temp = arr[i]
            arr[i] = arr[start]
            arr[start] = temp
            break
        }
    }
}

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val k = sc.nextInt()

    val arr = Array(n) {
        sc.nextInt()
    }

    val result = largestPermutation(k, arr)

    println(result.joinToString(" "))
}