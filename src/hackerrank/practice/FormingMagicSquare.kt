package hackerrank.practice

fun formingMagicSquare(s: Array<Array<Int>>): Int {
    var ans = Integer.MAX_VALUE

    val magicSquares =
        arrayOf(
            arrayOf(
                arrayOf(8, 1, 6),
                arrayOf(3, 5, 7),
                arrayOf(4, 9, 2)
            ),
            arrayOf(
                arrayOf(4, 3, 8),
                arrayOf(9, 5, 1),
                arrayOf(2, 7, 6)
            ),
            arrayOf(
                arrayOf(2, 9, 4),
                arrayOf(7, 5, 3),
                arrayOf(6, 1, 8)
            ),
            arrayOf(
                arrayOf(6, 7, 2),
                arrayOf(1, 5, 9),
                arrayOf(8, 3, 4)
            ),
            arrayOf(
                arrayOf(6, 1, 8),
                arrayOf(7, 5, 3),
                arrayOf(2, 9, 4)
            ),
            arrayOf(
                arrayOf(8, 3, 4),
                arrayOf(1, 5, 9),
                arrayOf(6, 7, 2)
            ),
            arrayOf(
                arrayOf(4, 9, 2),
                arrayOf(3, 5, 7),
                arrayOf(8, 1, 6)
            ),
            arrayOf(
                arrayOf(2, 7, 6),
                arrayOf(9, 5, 1),
                arrayOf(4, 3, 8)
            )
        )

    for (magicSquare in magicSquares) {
        ans = Math.min(diff(s, magicSquare), ans)
    }


    return ans
}

fun diff(s1: Array<Array<Int>>, s2: Array<Array<Int>>) : Int{
    var ans = 0

    for (i in 0..2) {
        for (j in 0..2) {
            ans += Math.abs(s1[i][j] - s2[i][j])
        }
    }
    return ans
}
