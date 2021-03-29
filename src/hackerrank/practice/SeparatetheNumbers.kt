
// Complete the separateNumbers function below.

fun main() {
    separateNumbers("11111111111111111111111111111111")
}

fun separateNumbers(s: String): Unit {

    for (length in 1 .. s.length / 2) {
        var current = s.substring(0, length).toLong()

        var target = "$current"

        while (target.length < s.length) {
            current++
            target += current
        }

        if (target == s) {
            print("YES ${s.substring(0, length)}")
            return
        }
    }

    print("NO")


}