package hackerrank.practice

fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
    bill[k] = 0
    val ans = b - (bill.sum() / 2)

    if (ans == 0) {
        println("Bon Appetit")
    } else {
        println(ans)
    }
}