package extension_functions

fun Int?.factorial(): Int {
    if(this == null || this < 0) {
        return -1
    }

    var factorial = 1
    for(i in 1 until this + 1) {
        factorial = factorial * i
    }

    return factorial
}


fun main() {
    println("Enter the number: ")
    val number = readln()
    val input = number.toIntOrNull()
    val result = input.factorial()
    if(result == -1) {
        println("Please enter a non negative valid integer")
    } else {
        println(result)
    }
}