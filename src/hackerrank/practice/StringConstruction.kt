package hackerrank.practice

import kotlin.math.cos


// Complete the stringConstruction function below.
fun stringConstruction(s: String): Int {

    val set = mutableSetOf<Char>()

    var cost = 0

    for (c in s) {
        if (!set.contains(c)) {
            cost++
            set.add(c)
        }
    }
    return cost

}