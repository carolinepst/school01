class Staff(
    private var name: String,
    private var id: String,
    private var position: String
) {
    fun getName(): String = name
    fun setName(newName: String) { name = newName }

    fun getId(): String = id
    fun setId(newId: String) { id = newId }

    fun getPosition(): String = position
    fun setPosition(newPosition: String) { position = newPosition }

    fun displayInfo() {
        println("=== Staff Info ===")
        println("ID       : $id")
        println("Name     : $name")
        println("Position : $position")
    }
    
    fun doWork() {
        println("Staff $name sedang bekerja sebagai $position")
    }

    fun report() {
        println("Staff $name melaporkan tugasnya.")
    }
}

fun main() {
    val staff1 = Staff("Siti", "A001", "Cleaning Service")
    staff1.displayInfo()
    staff1.doWork()
    staff1.report()
}
