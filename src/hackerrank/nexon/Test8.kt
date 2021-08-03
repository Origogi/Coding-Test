package hackerrank.nexon

//    public static long countOptions(int people, int groups) {
//        // Write your code here
//
//    }
//
fun countOptions(people: Int, group: Int): Long {
    return findGroup(1, people, group /*mutableListOf()*/)
}

fun findGroup(base: Int, people: Int, remainGroup: Int /*list: List<Int>*/): Long {
    if (remainGroup == 1) {
        return if (people >= base) {
//            println(list.toMutableList().apply { add(people) })
            1L
        } else {
            0L
        }
    }


    var ans = 0L
    for (i in base..people) {
        val remainPeople = people - i

//            val nextList = list.toMutableList().apply {
//                add(i)
//            }
        ans += findGroup(i, remainPeople, remainGroup - 1/* nextList*/)

    }
    return ans

}

fun main() {
    println(countOptions(8, 4))
}