fun main(){
    val firstName = "L";
    val lastName = "B";

    val fullName = calculateFullName(firstName, lastName);
    println(fullName);
}

fun calculateFullName(firstName: String, lastName: String): String {
    return "$firstName $lastName";
}