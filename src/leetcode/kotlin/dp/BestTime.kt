package leetcode.dp

fun maxProfit(prices: IntArray): Int {
    var buyDay = 0
    var maxProfit = 0

    var sellDay = 0
    while (++sellDay < prices.size) {
        val profit = prices[sellDay] - prices[buyDay]

        if (profit < 0) {
            buyDay = sellDay
        } else {
            maxProfit = Math.max(maxProfit, profit)
        }

    }
    return maxProfit

}

fun main() {
    `print Hello world`()
}

fun `print Hello world` () {
    println("Hello world")
}
