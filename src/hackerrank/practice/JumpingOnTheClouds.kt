package hackerrank.practice

// Complete the jumpingOnClouds function below.
fun jumpingOnClouds(c: Array<Int>, k: Int): Int {
    val N = c.size
    var current = 0
    var remain = 100

    do {
        current = (current + k) % N
        remain = remain - 1 - if (c[current] == 0 ) { 0 } else { 2 }
    } while (current != 0)

    return remain
}
