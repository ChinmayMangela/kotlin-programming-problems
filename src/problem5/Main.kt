package problem5

import problem1.User
import problem2.Product

fun main() {
    val clarion = User(id = 9, name = "clarion", email = "clarion@gmail.com")
    val macbookProDescription = "13 inch macbook pro with 1 TB storage and power of new M4 chip"
    val macbookPro = Product(id = 1, name = "Macbook Pro", price = 4000.0, description = macbookProDescription)

    val userResponse = UserResponse(
        user = clarion
    )

    val productResponse = ProductResponse(
        product = macbookPro
    )

    val success = ApiResponseItem.Success
    val error = ApiResponseItem.Error

    val dynamicList = listOf(userResponse, productResponse, success, error)

    dynamicList.forEach {
        when(it) {
            is ProductResponse -> println("Product Fetched: ${productResponse.product.name}")
            is UserResponse -> println("User fetched: ${userResponse.user.name}")
            is ApiResponseItem.Success -> println("Operation Successful")
            is ApiResponseItem.Error -> println("An error occurred")
        }
    }
}