//Find and print all numbers greater than 15.
//Sort the list in ascending order and print the result.
//Expected Output:
//Numbers greater than 15: [20, 25, 30]
//Sorted List: [5, 10, 15, 20, 25, 30]

fun main() {
    val numberArray = listOf(10, 5, 20, 15, 25, 30);
    var highNumbers = numberArray.filter { it > 15 };

    println("Numbers greater than 15: $highNumbers");
    println("Sorted List: ${numberArray.sorted()}");
}