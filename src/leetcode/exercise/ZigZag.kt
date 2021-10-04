package leetcode.exercise

fun convert(s: String, numRows: Int): String {
    if (numRows == 1) {
        return s
    }


    val map = Array(numRows) {
        arrayOfNulls<Char?>(s.length)

    }

    var goToDown = false
    var x = 0
    var y = 0

    for (c in s) {
        map[x][y] = c

        if (x == 0 || x == numRows -1) {
            goToDown =!goToDown
        }

        if (goToDown) {
            x++
        } else {
            x--
            y++
        }

    }

    val sb = StringBuilder()

    for (arr in map) {
        for (c in arr) {
            if (c != null) {
                sb.append(c)
            }
        }
    }

    return sb.toString()
}