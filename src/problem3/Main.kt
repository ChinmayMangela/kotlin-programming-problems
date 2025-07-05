package problem3

import problem2.Product
import problem2.printProductDetails


fun main() {
    val macbookProDescription = "13 inch macbook pro with 1 TB storage and power of new M4 chip"
    val pixelDescription = null

    val macbookPro = Product(id = 1, name = "Macbook Pro", price = 4000.0, description = macbookProDescription)
    val pixelNinePro = Product(id = 2, name = "Google Pixel 9 Pro", price = 1500.0, description = pixelDescription)
    val pixelWatch = Product(id = 3, name = "Google Pixel LTE smartwatch", price = 250.0, description = null)

    val listOfProduct = listOf(macbookPro, pixelNinePro, pixelWatch)
    listOfProduct.forEach {
        println(it.name)
    }

    val productsWithDescription = listOfProduct.filter {
        it.description != null
    }

    productsWithDescription.forEach {
        printProductDetails(it)
    }
}