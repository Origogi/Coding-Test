package hackerrank.practice
// Complete the beautifulBinaryString function below.

fun main() {
    beautifulBinaryString("0100101010")
}

fun beautifulBinaryString(b: String): Int {

    var ans = 0
    val chars = b.toCharArray()

    for (i in 0 until b.length -2) {

        if ("${chars[i]}${chars[i+1]}${chars[i+2]}" == "010") {
            ans++;

            if (i + 3 < b.length && chars[i+3] == '1') {
                chars[i+2] = '1'
            } else {
                chars[i +1] = '0'
            }
        }
    }
    return ans
}