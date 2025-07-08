package extension_functions

fun main() {
    val nums = listOf(144, 62, 53, 47)

    println(nums.secondHighest())
}


fun List<Int>?.secondHighest(): Int {
    if (this == null || this.size < 2) return -1
    val first = this.maxOrNull() ?: -1
    val second = this.filter {
        it != first
    }.maxOrNull() ?: -1
    return second
}