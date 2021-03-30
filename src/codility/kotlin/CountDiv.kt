package codility.kotlin

fun main() {
    print(0 % 7)
}

class CountDiv {



    fun solution(A: Int, B: Int, K: Int): Int {
        return if (A == 0) B/ K + 1 else B/K - (A-1) / K
    }

}