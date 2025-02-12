fun main(){

    val numbers = listOf(2.5, 7.1, 3.8, 9.2, 5.6)

    val smallest = numbers.minOrNull()
    val largest = numbers.maxOrNull()

    println("Smallest number: $smallest")
    println("Largest number: $largest")

}