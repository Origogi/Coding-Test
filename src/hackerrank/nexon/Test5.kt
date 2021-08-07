package hackerrank.nexon

fun commonSubstring(a: Array<String>, b: Array<String>): Unit {
    for (i in a.indices) {
        check(a[i], b[i])
    }
}

fun check(strA: String, strB: String) {
    val setA = strA.toHashSet()
    val setB = strB.toHashSet()

    val result = setA.find {
        setB.contains(it)
    }?.let {
        "YES"
    } ?: "NO"

    println(result)
}

fun main() {
    commonSubstring(arrayOf("abc"), arrayOf("efg"))
}