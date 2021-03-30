package codility.kotlin

fun main() {
    print(solution(1041 ))
}

fun solution(N: Int): Int {
    var start = false

    var current = N
    var length = 0
    var maxLength = 0

    while (current > 0) {
        if (current % 2 == 1) {
            if (!start) {
                start = true
            } else {
                maxLength = Math.max(maxLength, length)
                length = 0
            }

        } else {
            if (start) {
                length++
            }
        }

        current = current /2

    }
    return maxLength

}
