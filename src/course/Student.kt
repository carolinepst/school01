package course

import java.net.InetAddress

class Student(
    name: String,
    var studentid: String,
    address: String,
    phoneNumber: String
) : Person(name, address, phoneNumber){
    override fun displayInfo() {
        super.displayInfo()
        println("Student ID: $studentid")
    }
}

