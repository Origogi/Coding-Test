import java.lang.StringBuilder

class Person( var name : String)

fun main() {

    println(Test1().solution(3, 1, intArrayOf(2, 1, 1, 0, 1)))

    Person("a").apply { this.name = "a" }
    Person("a").also { it.name = "a" }

}

class Test1 {


    fun solution(U: Int, L: Int, C: IntArray): String {

        var a = U
        var b = L

        if (a +b != C.sum()) {
            return "IMPOSSIBLE"
        }

        var resultA = StringBuilder()
        var resultB = StringBuilder()

        for (c in C) {

            val (nextA, nextB) = when (c) {
                2 -> Pair(1, 1)
                1 -> if (a > b) {
                        Pair(1, 0)
                    } else {
                        Pair(0, 1)
                    }
                else -> Pair(0, 0)
            }

            a -= nextA
            b -= nextB

            resultA.append(nextA)
            resultB.append(nextB)
        }

        return "${resultA.toString()},${resultB.toString()}"
    }

}