package hackerrank.practice

fun main() {
//    highestValuePalindrome("092282", 6, 3)
            highestValuePalindrome("092282", 6, 3)

}

// Complete the highestValuePalindrome function below.
fun highestValuePalindrome(s: String, n: Int, k: Int): String {

    var result = s.toCharArray()
    var remainCost = k

    for (i in 0 until n/2) {


        if (result[i] > result[n -1 -i]) {
            result[n -1 -i] = result[i]
            remainCost--
        } else if (result[i] < result[n -1 -i]) {
            result[i] = result[n -1 -i]
            remainCost--
        }
    }

    if (remainCost <0) {
        return "-1"
    }

    var index = 0

    while (index <= n/2) {
        val target = result.copyOf()
        target[index] = '9'
        target[n -1 - index] = '9'

        val diffCount = getDiffCount(s, target)

        if (diffCount <= k) {
            result = target

            if (diffCount == k) {
                break
            } else if (diffCount == 1) {
                index = n/2
            } else {
                index++
            }
        } else {
            index++
        }

    }

    return String(result)
}

fun getDiffCount(s: String, target: CharArray): Int {

    var diff = 0
    for (i in target.indices) {
        if (s[i] != target[i]) {
            diff++
        }
    }
    return diff

}
