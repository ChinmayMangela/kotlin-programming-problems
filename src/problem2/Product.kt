package problem2

data class Product(
    val id: Int,
    val name: String,
    val price: Double,
    val description: String?
)


fun printProductDetails(product: Product) {
    val description = product.description ?: "No description available"
    println("Name: ${product.name}\nPrice: ${product.price} USD\nDescription: $description")
}
