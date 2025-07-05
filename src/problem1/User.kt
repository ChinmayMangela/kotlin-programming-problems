package problem1

data class User(
    val id: Int,
    val name: String?,
    val email: String?
) {
    fun copyWith(
        name: String? = null,
        email: String? = null
    ): User {
        return User(
            id = this.id,
            name = name ?: this.name,
            email = email ?: this.email
        )
    }
}

fun printUserDetails(user: User) {
    val name = user.name ?: "Unknown User"
    val email = user.email ?: "no-reply@gmail.com"
    println("Id: ${user.id}\nName: $name\nEmail: $email")
}
