package hackerrank.practice

import kotlin.math.absoluteValue

// Complete the makingAnagrams function below.
fun makingAnagrams(s1: String, s2: String): Int {

    val charMap = mutableMapOf<Char, Int>()

    val strMap1 = s1.groupingBy { it }.eachCount()
    val strMap2 = s2.groupingBy { it }.eachCount()

    var c : Char = 'a'

    while (c <='z') {
        charMap[c] = (strMap1.getOrDefault(c, 0) - strMap2.getOrDefault(c, 0)).absoluteValue
        c++

    }
    return charMap.map { it.value }.sum()

}