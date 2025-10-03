package course

class Course(
    var courseName: String,
    var subject: Subject
) {
    private val studentList = mutableListOf<Student>()
    private val teacherList = mutableListOf<Teacher>()

    // Getter
    fun getStudents(): List<Student> = studentList
    fun getTeachers(): List<Teacher> = teacherList

    // Tambah/Hapus Student
    fun addStudent(student: Student) {
        studentList += student
    }

    fun removeStudent(student: Student) {
        studentList -= student
    }

    // Tambah/Hapus Teacher
    fun addTeacher(teacher: Teacher) {
        teacherList += teacher
    }

    fun removeTeacher(teacher: Teacher) {
        teacherList -= teacher
    }

    // Fungsi untuk menampilkan info course
    fun showCourseInfo() {
        println("Course: $courseName")
        println("Subject: ${subject.subjectName}")
        println("Total Teachers: ${teacherList.size}")
        println("Total Students: ${studentList.size}")
    }
}
