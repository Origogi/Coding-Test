package hackerrank.practice


fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = runningTime(arr)

    println(result)
}


fun runningTime(arr: Array<Int>): Int {
    // Write your code here

    var ans = 0

    for (i in 1 until arr.size) {
        val value = arr[i]
        var j = i -1

        while ( j >= 0 && arr[j] > value) {
            arr[j +1] = arr[j]
            j--
            ans++
        }
        arr[j +1] = value
    }



    return ans

}
