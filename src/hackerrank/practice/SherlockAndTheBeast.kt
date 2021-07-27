package hackerrank.practice

fun main() {
    arrayOf(1,2,10,100,100,200).forEach { decentNumber(it)
    }
}


fun decentNumber(n: Int): Unit {
    // Write your code here
    var N = n
    var ans = ""

    var fiveCount = 0
    var threeCount = 0

    while (N >= 3) {
        if (N % 3 == 0) {
            fiveCount++
            N -= 3
        } else if (N % 5 == 0) {
            threeCount++
            N -= 5
        } else {
            fiveCount++
            N -= 3
        }
    }

    if (N != 0) {
        println(-1)
    } else {
        val sb = StringBuilder()

        repeat(fiveCount) {
            sb.append("555")
        }
        repeat(threeCount) {
            sb.append("33333")
        }
        println(sb.toString())
    }
}