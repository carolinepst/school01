package course
class Student(
    name: String,
    address: String,
    phoneNumber: String,
    var studentId: String,
    var major: String
) : Person(name, address, phoneNumber) {


    override fun displayInfo() {
        super.displayInfo()
        println("Student ID: $studentId")
        println("Major: $major")
    }
}


