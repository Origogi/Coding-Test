package hackerrank.practice

fun jimOrders(orders: Array<Array<Int>>): Array<Int> {
    return orders.mapIndexed { i, arr ->
        i + 1 to arr.sum()
    }.sortedWith(
        compareBy(
            { it.second }, { it.first }
        )
    ).map { it.first }.toTypedArray()
}