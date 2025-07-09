package null_safety


/*
Problem 2: Nullable Nested Objects
API responses often have nested structures, and inner objects can sometimes be null.
Task: Define two data classes:
ContactInfo: email (String), phone (String?).
Customer: customerId (String), name (String), contact (ContactInfo?).
Task: Create two Customer instances:
One where contact is null.
One where contact is not null, but phone inside ContactInfo is null.
One where contact is not null and phone is also not null.
Task: Write a function getCustomerEmail(customer: Customer): String? that safely returns the customer's email address. If contact is null or email within contact is null, it should return null.
Task: Write a function getCustomerPhone(customer: Customer): String that returns the customer's phone number. If contact is null or phone is null, it should return "N/A".
Task: Print the email and phone for all three customer instances.
 */

fun main() {

    val firstCustomerContact = ContactInfo(
        email = "customerOne@gmail.com",
        phone = "1233456789"
    )

    val customerOne = Customer(
        customerId = "1",
        name = "Customer 1",
        contact = firstCustomerContact
    )

    val secondCustomerContact = ContactInfo(
        email = "customerTwo@gmail.com",
        phone = null
    )

    val customerTwo = Customer(
        customerId = "2",
        name = "Customer 2",
        contact = secondCustomerContact
    )

    val customerThree = Customer(
        customerId = "3",
        name = "Customer 3",
        contact = null
    )

    val customers = listOf(customerOne, customerTwo, customerThree)
    customers.forEach {
        println(getCustomerEmail(it))
        println(getCustomerPhone(it))
    }
}


data class ContactInfo(
    val email: String,
    val phone: String?,
)


data class Customer(
    val customerId: String,
    val name: String,
    val contact: ContactInfo?,
)

fun getCustomerEmail(customer: Customer): String? {
    return customer.contact?.email
}

fun getCustomerPhone(customer: Customer): String {
    return customer.contact?.phone ?: "N/A"
}
