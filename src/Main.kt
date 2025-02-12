fun main() {

    // Part 1
    val fruitList = mutableListOf("Apple", "Mango", "Orange")
    fruitList.add("Pineapple")
    fruitList.removeAt(1)

    println(fruitList)

    // Part 2
    val setNumbers = mutableSetOf(1, 2, 3, 3, 4, 5, 5)
    setNumbers.addAll(setOf(3, 6))
    println(setNumbers)

    // Part 3
    val countryNames = mutableMapOf("USA" to "Washington", "France" to "Paris", "Germany" to "Berlin")
    countryNames["Canada"] = "Ottawa"

    println("Countries: ${countryNames.keys}")
    println("Capitals: ${countryNames.values}")

    countryNames.remove("USA")
    println("Final Map: $countryNames")

    // Part 4
    val carBrands = arrayListOf("BMW", "Toyota", "Honda")
    carBrands.addAll(listOf("Ford", "Jeep"))
    carBrands.remove("Jeep")

    println(carBrands)

    // Part 5
    val filterNumbers = listOf(10, 5, 20, 15, 25, 30)
    println("Numbers greater than 15: ${filterNumbers.filter { it > 15 }}")
    println("Sorted List: ${filterNumbers.sorted()}")

    // Part 6
    val floatNumbers = listOf(2.5, 7.1, 3.8, 9.2, 5.6)
    println("Largest number: ${floatNumbers.maxOrNull()}")
    println("Smallest number: ${floatNumbers.minOrNull()}")
}

