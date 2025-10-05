package course

class Table(
    var tableId: Int,
    var material: String
) {
    fun displayInfo() {
        println("Table ID: $tableId | Material: $material")
    }
}
