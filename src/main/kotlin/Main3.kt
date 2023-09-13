fun calculateFullName2(firstName:String, lastName: String) :Pair<String,Int> {
     val calculateFull : Pair<String, String> = Pair (firstName, lastName);
    val fullName = "$firstName $lastName";
    val fullNameLength = fullName.length;
    return Pair(fullName, fullNameLength);
}

fun main() {
    val firstName = "ll";
    val lastName = "B";

    val (fullName, fullNameLength) = calculateFullName2(firstName, lastName);
    println("Полное имя: $fullName");
    println("Длина имени: $fullNameLength");
}