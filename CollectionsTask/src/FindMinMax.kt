fun main() {
    val numbers = listOf(2.5, 7.1, 3.8, 9.2, 5.6)

    val largest = numbers.maxOrNull()
    val smallest = numbers.minOrNull()

    println("Largest number: $largest")
    println("Smallest number: $smallest")
}