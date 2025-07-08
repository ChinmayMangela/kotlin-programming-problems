package extension_functions

//Given a list of strings, implement the method `groupByLength` that returns a map
//where the key is the length of the word, and the value is a list of all words
//from the input list that have that length.
//Example:
//Input: ["apple", "bat", "car", "dog", "elephant"]
//Output: {
//    3 = ["bat", "car", "dog"],
//    5 = ["apple"],
//    8 = ["elephant"]
//}
fun main() {
    val input = listOf("apple", "bat", "car", "dog", "elephant")
    val result = input.groupByLength()

    for((key, value) in result) {
        println("$key -> $value")
    }
}

fun List<String>?.groupByLength(): Map<Int, List<String>> {
    return this?.groupBy {
        it.length
    } ?: emptyMap()
}