//task_1_______________________________________________________________
fun main(){
    val firstName = "Lya";
    val lastName = "Belya";
    printFullName(firstName, lastName);
//task_2__________________________________________
    printFullName(firstName = "L ", lastName = "B");
}
fun printFullName (firstName: String, lastName: String) {
    val fullName = "$firstName $lastName";
    println(fullName);
}
