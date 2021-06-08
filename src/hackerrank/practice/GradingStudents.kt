package hackerrank.practice

import kotlin.math.round

fun gradingStudents(grades: Array<Int>): Array<Int> {

    for (i in grades.indices) {
        grades[i] = grades[i].let {grade ->
            if (grade <38) {
                grade
            } else {
                val r = (grade % 5).let { round ->
                    when (round) {
                        in 3..4 -> {
                            5
                        }
                        else -> {
                            round
                        }
                    }
                }
                (grade / 5) * 5 + r
            }
        }
    }
    return grades
}
