package course

class Teacher (
    name : String,
    address : String,
    phoneNumber : String,
    var nip : Int
): Person(name, address, phoneNumber){
    override fun displayInfo(){
        super.displayInfo()
        println("Nip : $nip")
    }
}