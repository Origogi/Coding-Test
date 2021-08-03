package hackerrank.practice

fun toys(w: Array<Int>): Int {
    // Write your code here
    w.sort()
    var ans = 1

    var start = w[0]

    for (current in w) {
        if (start + 4 < current) {
            ans++
            start = current
        }
    }
    return ans
}
