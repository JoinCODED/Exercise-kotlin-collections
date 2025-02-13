fun main(){
    val number = listOf(10, 5, 20, 15, 25, 30)
    val greaterThan15 = number.filter { it > 15 }
    println(greaterThan15)


    val sortedNum = number.sorted()
    println("Sorted List: $sortedNum")
}