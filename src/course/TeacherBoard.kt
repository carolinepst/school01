package course

class TeacherBoard(
    var teacherList: MutableList<Teacher>,
    var leader: Teacher
) {
    fun addTeacher(teacher: Teacher) {
        teacherList.add(teacher)
    }

    fun removeTeacher(teacher: Teacher) {
        teacherList.remove(teacher)
    }

    fun displayInfo(){
        println("=== Teacher Board ===")
        println("leader: ${leader.name}")
        println("Teacher Member:")
        teacherList.forEach {println("- ${it.name}")}
    }
}