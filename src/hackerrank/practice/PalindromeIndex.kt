package hackerrank.practice

// Complete the palindromeIndex function below.
fun palindromeIndex(s: String): Int {

    val indexOfNoPalindrome : Int = getIndexNoPalindrome(s)

    if (indexOfNoPalindrome == -1) {
        return -1;
    }

    val targetIndex = listOf<Int>(indexOfNoPalindrome , s.length -1 - indexOfNoPalindrome)

    for ( i in targetIndex) {
        val target = s.removeRange(i , i+1)
        if ( -1 == getIndexNoPalindrome(target)) {
            return i;
        }
    }
    return -1;

}

fun getIndexNoPalindrome(s: String): Int {
    for ( i in 0 until s.length /2) {
        if (s[i] != s[s.length -1 - i]) {
            return i;
        }
    }
    return -1;

}
