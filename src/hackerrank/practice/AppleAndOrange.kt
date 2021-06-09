package hackerrank.practice

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    println(apples.map { it + a }.filter { it in s..t }.size)
    println(oranges.map { it + b }.filter { it in s..t }.size)
}
