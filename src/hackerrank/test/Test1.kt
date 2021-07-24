package hackerrank.test

fun main() {
    cardinalitySort(arrayOf(1,2,3,4,5))
}

fun cardinalitySort(nums: Array<Int>): Array<Int> {
    // Write your code here

    nums.sortWith( Comparator { a,b ->
        val binaryCountA = binaryCount(a)
        val binaryCountB = binaryCount(b)

        if (binaryCountA == binaryCountB) {
            a-b
        } else {
            binaryCountA - binaryCountB
        }
    })

    return nums

}

fun binaryCount(num : Int) : Int {
    return Integer.toBinaryString(num).filter { it == '1' }.count()
}
