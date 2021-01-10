package codility.naver_test

fun solution(P: IntArray, S: IntArray): Int {

    var ans = 0;
    S.sortDescending()

    var remainPeople = P.sum()

    for (s in S) {
        remainPeople -= s
        ans++;
        if (remainPeople <=0) {
            break;
        }
    }

    return ans

}
