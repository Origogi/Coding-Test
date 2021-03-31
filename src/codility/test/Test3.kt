package codility.test

class Test3 {

    fun solution(S: String): Boolean {
        // write your code in Kotlin

        var findB = false

        for (c in S) {
            if (c == 'b') {
                findB = true
            } else {
                if (findB) {
                    return false
                }
            }
        }

        return true
    }

}