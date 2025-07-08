package extension_functions

/*
String.removeDuplicates()
Remove duplicate characters from a string while maintaining the original order.
Example: "programming".removeDuplicates() → "progamin"
*/

fun main() {
    println("Enter a string")
    val input = readln()
    println(input.removeDuplicates())
}


fun String?.removeDuplicates(): String {
   if(this == null) return ""

   val seen = mutableSetOf<Char>()
   val result = StringBuilder()

   for (char in this) {
       if(char !in seen) {
           seen.add(char)
           result.append(char)
       }
   }

    return result.toString()
}