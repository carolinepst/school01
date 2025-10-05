package course

class Chair(
    var chairId: Int,
    var material: String
) {
    fun displayInfo() {
        println("Chair ID: $chairId | Material: $material")
    }
}
