package codility.kotlin


fun solution(A: IntArray, K: Int): IntArray {
    // write your code in Kotlin

    if (K == 0 || A.isEmpty()) {
        return A
    }

    val r = K % A.size

    val list = mutableListOf<Int>()

    for (i in 0 until r) {
        list.add(A[A.size  - r + i])
    }

    for (i in 0 until A.size - r) {
        list.add(A[i])
    }

    return list.toIntArray()
}