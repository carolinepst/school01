package course

class Person {
    package course

    open class Person(
        var name: String,
        var address: String,
        var phoneNumber: String
    ) {
        open fun displayInfo() {
            println("Name: $name")
            println("Address: $address")
            println("Phone: $phoneNumber")
        }
    }

}