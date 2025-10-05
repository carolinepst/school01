package course

class Room(
    var roomName: String,
    var roomNumber: Int,
    var staff: Staff
) {
    private val tableList = mutableListOf<Table>()
    private val chairList = mutableListOf<Chair>()

    fun addTable(table: Table) {
        tableList.add(table)
    }

    fun removeTable(table: Table) {
        tableList.remove(table)
    }

    fun addChair(chair: Chair) {
        chairList.add(chair)
    }

    fun removeChair(chair: Chair) {
        chairList.remove(chair)
    }

    fun displayInfo() {
        println("=== Room Info ===")
        println("Room Name   : $roomName")
        println("Room Number : $roomNumber")
        println("Staff Incharge : ${staff.getName()}")
        println("Total Tables : ${tableList.size}")
        println("Total Chairs : ${chairList.size}")
    }

    fun displayFurniture() {
        println("--- Tables ---")
        if (tableList.isEmpty()) println("No tables yet")
        else tableList.forEach { it.displayInfo() }

        println("--- Chairs ---")
        if (chairList.isEmpty()) println("No chairs yet")
        else chairList.forEach { it.displayInfo() }
    }
}
