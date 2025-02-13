
val listOfNumbers = listOf(10,5,20,15,25,30)


fun main() {
    val numbersFiltered = listOfNumbers.filter { it > 15 }
    println("Numbers greater than 15: $numbersFiltered")
    val numbersSorted = numbersFiltered.sorted()
    println("Sorted List: $numbersSorted")

}