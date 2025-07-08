package problem6

import problem1.User
import problem2.Product

fun main() {
    val clarion = User(id = 9, name = "clarion", email = "clarion@gmail.com")
    val anesthesia = User(id = 11, name = "anesthesia", email = "anesthesia@gmail.com")
    val dummyUser = User(id = 2, name = "Dummy", email = null)

    println(dummyUser.isPremiumUser())

    val macbookProDescription = "13 inch macbook pro with 1 TB storage and power of new M4 chip"
    val pixelDescription = null

    val macbookPro = Product(id = 1, name = "Macbook Pro", price = 4000.0, description = macbookProDescription)
    val pixelNinePro = Product(id = 2, name = "Google Pixel 9 Pro", price = 1500.0, description = pixelDescription)
    println(macbookPro.formattedPrice())

    val listOfPeoples = listOf(clarion, anesthesia, dummyUser)
    val listOfProducts = listOf(macbookPro, pixelNinePro)

    listOfPeoples.forEach { it.printUserDetails() }
    listOfProducts.forEach { it.printProductDetails() }

}


fun User?.isPremiumUser() : Boolean {
    return (if(this == null) false else this.id % 2 == 0)
}

fun Product.formattedPrice(): String {
    return String.format("₹%.2f", this.price * 85.77)
}

fun User?.printUserDetails() {
    val name = this?.name ?: "UNKNOWN USER"
    val email = this?.email ?: "no-reply@gmail.com"
    println("Id: ${this?.id}\nName: $name\nEmail: $email")
}

fun Product?.printProductDetails() {
    val description = this?.description ?: "No description available"
    println("Id: ${this?.id}\nName: ${this?.name}\nDescription: $description")
}

