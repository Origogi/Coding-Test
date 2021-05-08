package codility.test

fun main() {
    print(Test4_2().solution(1,1,0))
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

class Test4_2 {
    fun solution(A: Int, B: Int, C: Int): String {
        val sb = StringBuilder()

        var buffer = arrayOf(' ', ' ')
        val map = mapOf('a' to A, 'b' to B, 'c' to C).filter { it.value > 0 }.toMutableMap()

        while (map.isNotEmpty()) {
            val ch: Char = getNext(map, buffer)

            map[ch]?.let {
                if (it == 1) {
                    map.remove(ch)
                } else {
                    map[ch] = it -1
                }
                sb.append(ch)
                buffer[0] = buffer[1]
                buffer[1] = ch
            } ?: run {
                map.clear()
            }
        }

        return sb.toString()

    }

    private fun getNext(map: Map<Char, Int>, buffer: Array<Char>): Char {

        val entry = map.map { it }.sortedByDescending { it.value }

        return if (buffer[0] == entry[0].key && buffer[1] == entry[0].key) {
            if (entry.size > 1) {
                entry[1].key
            } else {
                ' '
            }
        } else {
            entry[0].key
        }
    }
}