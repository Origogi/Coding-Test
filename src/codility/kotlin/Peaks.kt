package codility.kotlin

fun main() {
    Peaks().solution(intArrayOf(1,2,3,4,3,4,1,2,3,4,6,2))
}

class Peaks {

    fun solution(A: IntArray): Int {
        // write your code in Kotlin
        val peaks = arrayOfNulls<Boolean>(A.size).apply {
            for (i in this.indices) {
                this[i] = false
            }
        }

        var peaksCount = 0
        for (i in 1 until A.size -1) {
            if (A[i] > A[i-1] && A[i] > A[i+1]) {
                peaks[i] = true
                peaksCount++
            }
        }

        if (peaksCount == 0) {
            return 0
        }

        for ( n in peaksCount downTo 1) {
            if (A.size % n != 0) {
                continue
            }

            val length = A.size / n
            var start = 0
            var end = length -1

            var flag = true

            for (i in 0 until n) {
                var hasPeak = false
                for (j in start .. end) {
                    if (peaks[j]!!) {
                        hasPeak = true
                        break
                    }
                }

                if (!hasPeak) {
                    flag = false
                    break
                }

                start += length
                end += length
            }

            if (flag) {
                return n
            }
        }

        return 1


    }

}