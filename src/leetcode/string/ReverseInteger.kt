package leetcode.string

fun reverse(x: Int): Int {
    var result = 0

    val isMinus = x < 0
    var remain = Math.abs(x)

    while (remain > 0) {
        val mod = remain % 10
        val temp = result * 10L + mod

        if (temp > Integer.MAX_VALUE) {
            return 0
        }

        result = temp.toInt()
        remain = remain / 10
    }

    if (isMinus) {
        result = result * -1
    }

    return result
}