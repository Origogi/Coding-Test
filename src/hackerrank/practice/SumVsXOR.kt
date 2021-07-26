package hackerrank.practice

fun main() {
    print(sumXor(10))
}

fun sumXor(n: Long): Long {
    // Write your code here

    var zeroCount = 0
    var N = n
    while (N > 0) {
        if (N % 2L == 0L) {
            zeroCount++
        }
        N /= 2
    }
    return Math.pow(2.0, zeroCount.toDouble()).toLong()
}