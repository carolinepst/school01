package course

class Curriculum (
    var subjectList: MutableList<Subject> = mutableListOf()
) {
    fun addSubject(subject: Subject) {
        subjectList.add(subject)
    }

    fun removeSubject(subject: Subject) {
        subjectList.remove(subject)
    }

    fun displaySubjects() {
        println("=== Curriculum Subjects ===")
        if (subjectList.isEmpty()) {
            println("Belum ada mata pelajaran.")
        } else {
            subjectList.forEachIndexed { index, subject ->
                println("${index + 1}. ${subject.subjectName}")
            }
        }
    }
}