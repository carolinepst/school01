package course

class StudentOrganisation (
    var leaders: MutableList<Student>
){
    fun addLeader(student: Student){
        leaders.add(student)
    }

    fun removeLeader(student: Student){
        leaders.remove(student)
    }

    fun displayInfo(){
        println("=== Student Organisation ===")
        if (leaders.isEmpty()){
            println("Belum ada pengurus.")
        } else {
            println("Daftar Pengurus")
            leaders.forEach { leader ->
                println("- ${leader.name} (ID: ${leader.studentId})")
            }
        }
    }
}