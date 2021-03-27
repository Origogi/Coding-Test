import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*
import kotlin.math.absoluteValue


// Complete the funnyString function below.
fun funnyString(s: String): String {

    for (i in 0 until s.length /2) {
        val leftDiff = (s[i] - s[i + 1]).absoluteValue
        val rightDiff = (s[s.length -1 - i] - s[s.length -2 - i]).absoluteValue

        if (leftDiff != rightDiff) {
            return "Not Funny"
        }
    }

    return "Funny"
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = funnyString(s)

        println(result)
    }
}
