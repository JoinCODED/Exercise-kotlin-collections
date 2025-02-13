fun main (){
    val numberList = listOf(10, 5, 20, 15, 25, 30)
    val greaterThan = numberList.filter { it > 15 }
    val sortList = numberList.sorted()
    println("Numbers greater than 15: $greaterThan")
    println("Sorted List: $sortList")
}