package codility.test

data class Student(val id : Id, val name : String, val subscribedCourses: List<Course>)

data class Course(val id : Id, val name: String, val isPaid : Boolean)

typealias Id = Int


interface Repository<T> {
    fun get() : Iterable<T>
}

class University(private val repository: Repository<Student>) {
    fun getPaidCoursesWithTheNumberOfSubscribedStudent(coursesCount : Int) : Map<Course, Int> {

        val map = mutableMapOf<Course, Int>()

        for (student in repository.get()) {
            for ( course in student.subscribedCourses) {
                if (course.isPaid) {
                    val count = map.getOrDefault(course,0) + 1
                    map.put(course, count)
                }
            }
        }
        map.toList().sortedByDescending { it.second }.take(coursesCount).toMap()
        return map
    }
}

class Test2 {
}