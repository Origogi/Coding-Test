package hackerrank.practice

import java.util.*

fun queensAttack(n: Int, k: Int, r_q: Int, c_q: Int, obstacles: Array<Array<Int>>): Int {
    // Write your code here

    val queenX = r_q - 1
    val queenY = c_q - 1

    val moveX = arrayOf(0, 0, 1, -1, 1, -1, 1, -1)
    val moveY = arrayOf(1, -1, 0, 0, 1, -1, -1, 1)

    val flagSet = mutableSetOf<Pair<Int, Int>>()

    val obstaclesSet = obstacles.map {
        makeKey(it[0] -1, it[1] -1)
    }.toHashSet()


    repeat(8) {

        var currentX = queenX
        var currentY = queenY

        while (currentX in 0 until n
            && currentY in 0 until n
            && !obstaclesSet.contains(makeKey(currentX, currentY))
        ) {
            flagSet.add(Pair(currentX, currentY))
            currentX += moveX[it]
            currentY += moveY[it]
        }
    }

    return flagSet.size - 1
}

fun makeKey( x : Int,  y : Int) = "$x $y"


fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val second_multiple_input = readLine()!!.trimEnd().split(" ")

    val r_q = second_multiple_input[0].toInt()

    val c_q = second_multiple_input[1].toInt()

    val obstacles = Array<Array<Int>>(k, { Array<Int>(2, { 0 }) })

    for (i in 0 until k) {
        obstacles[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = queensAttack(n, k, r_q, c_q, obstacles)

    println(result)
}
