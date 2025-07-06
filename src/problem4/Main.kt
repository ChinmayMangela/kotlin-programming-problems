package problem4

fun main() {
    val addressOfClarion = Address(
        street = "123 Tech Lane",
        city = "Silicon Valley",
        zipCode = "94043"
    )

    val companyOfClarion = Company(
        name = "Meta",
        catchPhrase = "Connecting the world through immersive experiences"
    )


    val clarion = UserWithAddress(
        id = 1,
        name = "Clarion",
        email = "clarion@gmail.com",
        address = addressOfClarion,
        company = companyOfClarion
    )

    val addressOfAnesthesia = Address(
        street = "456 Health Ave",
        city = "Silicon Valley",
        zipCode = "94043"
    )

    val anesthesia = UserWithAddress(
        id = 2,
        name = "Anesthesia",
        email = "anesthesia@gmail.com",
        address = addressOfAnesthesia,
        company = null
    )

    val listOfPersons = listOf(clarion, anesthesia)

    listOfPersons.forEach {
        println(it.name)
        println(it.address.city)
        println(it.company?.name ?: "Person is still in learning phase")
    }
}