fun main() {
    val numbers = arrayListOf(10, 5, 20, 15, 25, 30)

    val sortedList = numbers.sorted()
    val filteredNumbers = numbers.filter {  num -> num >15 }


    println("Numbers greater than 15:"+filteredNumbers)
    println("Sorted List:"+ sortedList)
}