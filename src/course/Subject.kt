package course

class Subject(
    var subjectName: String, //nama variablenya jangan diubah ya
    var subjectCode: String,
    var teacher: Teacher? = null
) {
    private val courseList = mutableListOf<Course>()

    fun assignTeacher(teacher: Teacher) {
        this.teacher = teacher
    }

    fun removeTeacher() {
        this.teacher = null
    }

    // Tambah / Hapus Course
    fun addCourse(course: Course) {
        courseList.add(course)
    }

    fun removeCourse(course: Course) {
        courseList.remove(course)
    }

    fun getCourses(): List<Course> = courseList

    // Menampilkan informasi Subject
    fun displayInfo() {
        println("=== Subject Info ===")
        println("Subject Name : $subjectName")
        println("Subject Code : $subjectCode")

        if (teacher != null) {
            println("Taught by    : ${teacher?.name}")
        } else {
            println("No teacher assigned yet.")
        }

        println("Total Courses: ${courseList.size}")
        if (courseList.isNotEmpty()) {
            println("Courses List:")
            courseList.forEach { println("- ${it.courseName}") }
        }
    }
}