package extension_functions


fun main() {
    val nums = listOf<Int>(1,2,3,4)

    println(nums.averageSafe())
}

fun List<Int>?.averageSafe(): Double {
    if(this == null) return -1.0
    if(this.isEmpty()) return 0.0

    val sum = this.sum()
    return sum.toDouble() / this.size

}