package problem1

fun main() {
    val clarion = User(id = 9, name = "clarion", email = "clarion@gmail.com")
    val anesthesia = User(id = 11, name = "anesthesia", email = "anesthesia@gmail.com")
    val dummyUser = User(id = 3, name = "Dummy", email = null)

    val newUser = clarion.copyWith(name = "new user")

    printUserDetails(clarion)
    printUserDetails(anesthesia)
    printUserDetails(newUser)
    printUserDetails(dummyUser)
}