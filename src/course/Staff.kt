class Staff(
    private var name: String,
    private var id: String,
    private var position: String
) {
    // Getter & Setter manual
    fun getName(): String = name
    fun setName(newName: String) { name = newName }

    fun getId(): String = id
    fun setId(newId: String) { id = newId }

    fun getPosition(): String = position
    fun setPosition(newPosition: String) { position = newPosition }

    // Fungsi tambahan
    fun doWork() {
        println("Staff $name sedang bekerja sebagai $position")
    }

    fun report() {
        println("Staff $name melaporkan tugasnya.")
    }
}
