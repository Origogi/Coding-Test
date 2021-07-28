package hackerrank.nexon

fun main() {
    maxDifference(arrayOf(2,1))
}

fun maxDifference(px: Array<Int>): Int {
    // Write your code here

    if (px.size <=1) {
        return -1
    }

    var ans = px[1] - px[0]
    var start = px[0]

    for ( i in 1 until px.size) {
        if (start > px[i]) {
            start = px[i]
        } else {
            ans = Math.max(px[i] - start, ans)
        }

    }

    if (ans <= 0) {
        return -1
    } else {
        return ans
    }
}

class Test6 {
}