package hackerrank.practice

//timeout

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val data = Array(n) {
        sc.nextInt()
    }


    val edges = Array(n - 1) {
        arrayOf(sc.nextInt(), sc.nextInt())
    }

    val result = cutTheTree(data, edges)

    println(result)
}


fun cutTheTree(data: Array<Int>, edges: Array<Array<Int>>): Int {

    val totalSum = data.sum()
    var ans = totalSum

    val prefixSum = Array(data.size) { 0 }
    val visited = Array(data.size) { false }

    prefixSum(1, visited, prefixSum, data, edges)

    for (a in prefixSum) {
        val left = a
        val right = totalSum - left;
        ans = Math.min(Math.abs(left - right), ans)
    }
    return ans


}



fun prefixSum(
    currentV: Int, visited: Array<Boolean>,
    prefixSum: Array<Int>, data: Array<Int>, edges: Array<Array<Int>>
): Int {

    visited[currentV - 1] = true

    var sum = data[currentV - 1]

    if (prefixSum[currentV - 1] == 0) {
        for (i in edges.indices) {
            val nextV = when (currentV) {
                edges[i][0] -> {
                    edges[i][1]
                }
                edges[i][1] -> {
                    edges[i][0]
                }
                else -> {
                    -1
                }
            }

            if (nextV != -1 && !visited[nextV - 1]) {
                sum += prefixSum(nextV, visited, prefixSum, data, edges)
            }
        }
        prefixSum[currentV - 1] = sum

    }

    return prefixSum[currentV - 1]
}
