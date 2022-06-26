package leetcode.array

fun plusOne(digits: IntArray): IntArray {
    digits[digits.size -1]++

    for (i in digits.size -1 downTo 1) {
        if (digits[i] == 10) {
            digits[i -1]++
            digits[i] = 0
        } else {
            break
        }
    }

    if (digits[0] == 10) {
        return IntArray(digits.size + 1) {
            if (it == 0 ) {
                1
            } else if (it ==1) {
                0
            } else {
                digits[it -1]
            }
        }


    } else {
        return digits
    }
}