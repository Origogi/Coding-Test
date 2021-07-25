package hackerrank.practice

fun maximizingXor(l: Int, r: Int): Int {
    var ans = 0
    for (i in l.. r) {
        for (j in l .. r) {
            ans = Math.max(ans, i xor j)
        }
    }
    return ans
}