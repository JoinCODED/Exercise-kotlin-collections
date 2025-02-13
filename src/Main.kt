fun main() {

    // Part 1: Working with Lists
    val fruits = mutableListOf("Apple","Mango","Banana")
    fruits.add("Orange")
    fruits.removeAt(1)
    println("Part 1: $fruits")

    // Part 2: Working with Sets
    val mutableNumbers = mutableSetOf(1, 2, 3, 3, 4, 5, 5)
    mutableNumbers.add(3)
    mutableNumbers.add(6)
    println("Part 2: $mutableNumbers")

    //Part 3: Working with Maps
    val mutableCapitals = mutableMapOf("USA" to "Washington", "France" to "Paris", "Germany" to "Berlin")
    mutableCapitals["Canada"] = "Ottawa"
    println("Countries: ${mutableCapitals.keys}")
    println("Capitals: ${mutableCapitals.values}")
    println("Final Map: $mutableCapitals")

    // Part 4: Using ArrayList
    val carBrands = arrayListOf("BMW", "Toyota", "Honda")
    carBrands.add("Geely")
    carBrands.add("Ford")
    carBrands.removeAt(3)
    println("Part 4: $carBrands")

    // Part 5: Advanced Collection Operations
    val numbers = listOf(10, 5, 20, 15, 25, 30)
    println("Numbers grater than 15: ${numbers.filter { it > 15 }}")
    println("Sorted List: ${numbers.sorted()}")

    // Part 6: Finding Maximum & Minimum Values
    val floatingNumbers = listOf(2.5, 7.1, 3.8, 9.2, 5.6)
    println("Largest number: ${floatingNumbers.maxOrNull()}")
    println("Smallest number: ${floatingNumbers.minOrNull()}")

}