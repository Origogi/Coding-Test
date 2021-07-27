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


    val treeSum = Array(n - 1) {
        0
    }
    val result = cutTheTree(data, edges)

    println(result)
}

fun cutTheTree(data: Array<Int>, edges: Array<Array<Int>>): Int {

    val totalSum = data.sum()

    val treeMap = mutableMapOf<Int, MutableList<Int>>()
    val prefixSum = Array(data.size) {
        0
    }

    for (edge in edges) {

        for (i in 0..1) {
            val list = treeMap.getOrDefault(edge[i], mutableListOf())
            list.add(edge[if (i == 0) 1 else 0])
            treeMap[edge[i]] = list
        }
    }

    prefixSum(1, Array(data.size) { false }, data, treeMap, prefixSum)

    var ans = totalSum

    for (p in prefixSum) {
        val left = p
        val right = totalSum - left
        ans = Math.min(Math.abs(left - right), ans)

    }
    return ans
}


fun prefixSum(
    currentV: Int, visited: Array<Boolean>, data: Array<Int>, edges: Map<Int, List<Int>>, prefixSum: Array<Int>
): Int {

    visited[currentV - 1] = true

    var sum = data[currentV - 1]

    val nextList = edges[currentV]

    if (nextList != null) {
        for (nextV in nextList) {
            if (!visited[nextV - 1]) {
                sum += prefixSum(nextV, visited, data, edges, prefixSum)
            }
        }
    }

    prefixSum[currentV - 1] = sum
    return sum
}
