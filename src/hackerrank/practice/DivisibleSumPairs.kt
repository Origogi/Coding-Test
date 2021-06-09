package hackerrank.practice

fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {


    var ans = 0
    for ( i in 1 until ar.size) {
        for (j in 0 until i) {
            if ((ar[i] + ar[j]) % k == 0) {
                ans++
            }
        }
    }
    return ans

}
