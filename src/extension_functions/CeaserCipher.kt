package extension_functions

fun main() {
    println("CHINMAY".ceaserCipher(3))
}

fun String?.ceaserCipher(shift: Int): String {
    if (this == null || this.isEmpty()) return ""

    val result = StringBuilder()

    for (char in this) {
        when (char) {
            in 'A'..'Z' -> {
                val base = 'A'.code
                val shifted = (char.code - base + shift) % 26 + base
                result.append(shifted.toChar())
            }
            in 'a'..'z' -> {
                val base = 'a'.code
                val shifted = (char.code - base + shift) % 26 + base
                result.append(shifted.toChar())
            }
            else -> result.append(char)
        }

    }

    return result.toString()
}