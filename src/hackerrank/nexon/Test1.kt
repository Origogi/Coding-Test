package hackerrank.nexon


fun main() {
    cardPackets(arrayOf(3,9,7,6,5,2))
}
fun cardPackets(cardTypes: Array<Int>): Int {
    // Write your code here

    val max = cardTypes.max()!!

    var ans = Int.MAX_VALUE

    for ( i in 2..max) {
        var sum = 0
        for (a in cardTypes) {
            val d = (a % i)

            if (d != 0) {
                sum += i-  (a % i )
            }

        }
        ans = Math.min(ans, sum)
    }
    return ans

}