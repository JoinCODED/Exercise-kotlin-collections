val numberList = listOf(10, 5, 20, 15, 25, 30)
val greaterThan15 = numberList.filter {it > 15}


fun main() {
    println("Numbers greater than 15: $greaterThan15")
    println("Sorted List: ${numberList.sorted()}")
}