package codility.test

fun main() {
    Test4().solution(1,1,0)
}

class Test4 {

    fun solution(A: Int, B: Int, C: Int): String {
        // write your code in Kotlin

        var result = ""

        var a = A
        var b = B
        var c = C

        while (a >0 || b> 0 || c >0) {
            val ch : Char = getNext(a,b,c, result)


            if (ch == 'a') {
                a--
            } else if (ch == 'b') {
                b--
            } else if (ch == 'c') {
                c--
            } else {
                break
            }
            result += ch


        }

        return result

    }

    private fun getNext(a: Int, b: Int, c: Int, result: String): Char {
        val map = mapOf<Char, Int>('a' to a, 'b' to b, 'c' to c)

        val entry = map.map { it }.sortedByDescending { it.value }.filter { it.value > 0 }

        if (entry.isEmpty()) {
            return ' '
        }

        val target = entry[0].key

        if (result.length <2) {
            return target
        }

        if (result.substring(result.length-2) == "$target$target") {
            if (entry.size > 1) {
                return entry[1].key
            } else {
                return ' '
            }

        }
        return target
    }

}