package course

class Management (
    var principal: Teacher,
    var managerList: MutableList<Teacher>,
    var fieldManager: Staff
){
    fun displayInfo(){
        println("=== Management Info ===")
        println("Principal : ${principal.name}")
        println("ManagerList :")
        managerList.forEach { println("- ${it.name}")}
        println("Field Manager: ${fieldManager.getName()}")
    }

    fun addManager(manager: Teacher) {
        managerList.add(manager)
    }

    fun removeManager(manager: Teacher) {
        managerList.remove(manager)
    }
}