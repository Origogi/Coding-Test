package leetcode.string

fun myAtoi(s: String): Int {

    var result = 0

    for (i in s.indices) {
        if (s[i].isDigit()) {
            return parse(i, s, true)

        } else {
            if (i + 1 < s.length) {
                if (s[i] =='+') {
                    return parse(i + 1, s, true)
                } else if (s[i] == '-') {
                    return parse(i + 1, s, false)
                } else if (s[i] == ' ') {
                    continue
                } else {
                    // Error
                    break
                }
            }
        }
    }

    return 0
}

fun parse(start : Int, s : String, isPlus : Boolean) : Int {
    var temp : Long = 0L

    var i = start
    val sign = if (isPlus) 1 else -1

    while (i < s.length && s[i].isDigit() ) {
        temp = temp * 10 + ((s[i] - '0') * sign)

        if (temp >= Int.MAX_VALUE) {
            return Int.MAX_VALUE
        } else if (temp <= Int.MIN_VALUE) {
            return Int.MIN_VALUE
        }
        i++
    }
    return temp.toInt()
}

fun Char.isDigit() = this - '0' in 0..9
