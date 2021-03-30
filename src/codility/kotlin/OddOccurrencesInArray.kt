package codility.kotlin

fun solution(A: IntArray): Int {
    // write your code in Kotlin
    return A.reduce{ a,b -> a xor b }
}
