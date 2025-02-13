val minMax = listOf(2.5, 7.1, 3.8, 9.2, 5.6)

fun main() {
    println("Largest number: ${minMax.maxOrNull()}")
    println("Smallest number: ${minMax.minOrNull()}")
}