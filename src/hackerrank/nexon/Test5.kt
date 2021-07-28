package hackerrank.nexon

fun commonSubstring(a: Array<String>, b: Array<String>): Unit {
    for (i in a.indices) {
        check(a[i], b[i])
    }
}

fun check(strA : String, strB : String) {
    val setA = strA.toHashSet()
    val setB = strB.toHashSet()

    for (e in setA) {
        if (setB.contains(e)) {
            println("YES")
            return
        }
    }
    println("NO")
}

class Test5 {
}