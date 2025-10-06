package course

fun main() {
// === Buat Staff ===
    val staff1 = Staff("Siti", "ST001", "Cleaning Service")
    val staff2 = Staff("Budi", "ST002", "Administration")


    staff1.displayInfo()
    staff2.displayInfo()
    println()

// === Buat Teacher ===
    val teacher1 = Teacher("Andi", "Jl. Merpati 12", "08123", 12345)
    val teacher2 = Teacher("Rina", "Jl. Kenanga 34", "08145", 67890)

    teacher1.displayInfo()
    teacher2.displayInfo()
    println()

// === Buat Student ===
    val student1 = Student("Joko", "Jl. Melati 5", "08122", "S001", "Informatics")
    val student2 = Student("Sari", "Jl. Mawar 9", "08233", "S002", "Mathematics")
    val student3 = Student("Doni", "Jl. Anggrek 7", "08344", "S003", "Physics")

    student1.displayInfo()
    student2.displayInfo()
    println()

// === Buat Subject dan Course ===
    val subjectMath = Subject("Mathematics", "MTH101")
    val subjectCS = Subject("Computer Science", "CS201")

    val course1 = Course("Algebra 1", subjectMath)
    val course2 = Course("Mobile Programming", subjectCS)

// Assign teacher ke subject
    subjectMath.assignTeacher(teacher2)
    subjectCS.assignTeacher(teacher1)

// Tambah course ke subject
    subjectMath.addCourse(course1)
    subjectCS.addCourse(course2)

// Tambah student dan teacher ke course
    course1.addStudent(student2)
    course1.addTeacher(teacher2)

    course2.addStudent(student1)
    course2.addStudent(student3)
    course2.addTeacher(teacher1)

// Tampilkan info course
    course1.showCourseInfo()
    course2.showCourseInfo()
    println()

// === Curriculum ===
    val curriculum = Curriculum()
    curriculum.addSubject(subjectMath)
    curriculum.addSubject(subjectCS)
    curriculum.displaySubjects()
    println()

// === Room, Table, Chair ===
    val room1 = Room("Lab Komputer", 101, staff2)
    room1.addTable(Table(1, "Kayu"))
    room1.addTable(Table(2, "Metal"))
    room1.addChair(Chair(1, "Plastik"))
    room1.addChair(Chair(2, "Kayu"))

    room1.displayInfo()
    room1.displayFurniture()
    println()

// === Student Organisation ===
    val org = StudentOrganisation(mutableListOf(student1))
    org.addLeader(student2)
    org.displayInfo()
    println()

// === Teacher Board ===
    val board = TeacherBoard(mutableListOf(teacher1, teacher2), leader = teacher1)
    board.displayInfo()
    println()

// === Management ===
    val management = Management(
        principal = teacher2,
        managerList = mutableListOf(teacher1),
        fieldManager = staff1
    )
    management.displayInfo()

}
