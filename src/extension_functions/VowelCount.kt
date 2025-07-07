package extension_functions

fun main() {
    println("Enter a string:")
    val string = readln()
    val result = string.vowelCount()
    when(result) {
        -1 -> println("Please enter a valid non-empty string")
        0 -> println("No vowels found in the input")
        else -> println("Number of vowels: $result")
    }
}

fun String?.vowelCount(): Int {
    if (this == null) return -1
    if (this.isEmpty()) return 0

    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    return this.lowercase().count { it in vowels }
}
