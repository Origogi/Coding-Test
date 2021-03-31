package codility.kotlin

class MinPerimeterRectangle {

    fun solution(N: Int): Int {
        var a = 1
        var result = Int.MAX_VALUE
        
        while (a <= Math.sqrt(N.toDouble())) {
            if (N % a == 0) {
                val b = N / a
                result = Math.min(2 * a + 2 * b, result)
            }
            a++
        }

        return result
    }
}