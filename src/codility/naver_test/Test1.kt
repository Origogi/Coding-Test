package codility.naver_test

fun main() {

}

fun solution(S: Array<String>): IntArray {

    for (i in 0 until S.size -1) {
        for (j in i + 1 until S.size) {
            val strA = S[i];
            val strB = S[j];

            var k = 0

            while (k < strA.length && k < strB.length) {
                if (strA[k] == strB[k]) {
                    return intArrayOf(i,j,k);
                }
                k++;
            }
        }
    }
    return IntArray(0)
}
