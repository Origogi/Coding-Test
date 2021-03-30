package codility.kotlin

class GenomicRangeQuery {
    fun solution(S: String, P: IntArray, Q: IntArray): IntArray {
        // write your code in Kotlin

        val prefixList = mutableListOf<Array<Int>>()

        val prefixSum = arrayOf(0,0,0,0)

        val impactList = listOf('A', 'C', 'G', 'T')

        for (c in S) {

            for (i in impactList.indices) {
                if (c == impactList[i]) {
                    prefixSum[i]++
                    break
                }
            }
            prefixList.add(prefixSum.copyOf())
        }

        val result = mutableListOf<Int>()

        for ( i in P.indices) {
            if (P[i] != 0) {
                val prefixSumL = prefixList[P[i]-1]
                val prefixSumR = prefixList[Q[i]]

                for (j in prefixSumL.indices) {
                    if (prefixSumR[j] - prefixSumL[j] > 0) {
                        result.add(j + 1)
                        break
                    }
                }

            } else {
                val prefixSumR = prefixList[Q[i]]
                for (j in prefixSumR.indices) {
                    if (prefixSumR[j] > 0) {
                        result.add(j + 1)
                        break
                    }
                }
            }
        }

        return result.toIntArray()
    }

}