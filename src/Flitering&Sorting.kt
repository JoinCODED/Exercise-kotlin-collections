fun main(){

    val numbers = listOf(10,5,20,15,25,30)

    val greaterthan15 = numbers.filter { it > 15 }
    println("Numbers greater than 15: $greaterthan15")

    val ascendingOrder = numbers.sorted()
    println("Sorted list: $ascendingOrder")
}