
fun main() {

    //Part 1: Working with Lists
    val favoriteFruits = mutableListOf("Apple", "Cherry", "Mango")
    favoriteFruits.add("Orange")
    favoriteFruits.removeAt(1)
    println(favoriteFruits)

  //Part 2: Working with Sets
    val setOfNumbers = mutableSetOf(1, 2, 3, 3, 4, 5, 5)
    setOfNumbers.add(3)
    setOfNumbers.add(6)
    println(setOfNumbers)

    //Part 3: Working with Maps
    val countryNamesCapitals = mutableMapOf("USA" to "Washington", "France" to "Paris", "Germany" to "Berlin")
    countryNamesCapitals["Canada"] = "Ottawa"
    println("Countries:" + countryNamesCapitals.keys )
    println("Capitals:" +countryNamesCapitals.values )
    countryNamesCapitals.remove("Germany")
    println("Final Map:" + countryNamesCapitals )

    //Part 4: Using ArrayList
    val carBrands = arrayListOf("BMW", "Toyota", "Jeep")
    carBrands.add("Honda")
    carBrands.add("Ford")
    carBrands.remove("Jeep")
    println(carBrands)

    //Part 5: Advanced Collection Operations
    val numbers = listOf(10, 5, 20, 15, 25, 30)
    val greaterThan15 = numbers.filter { it > 15 }
    println("Numbers greater than 15: $greaterThan15")
    val sortedNumbers = numbers.sorted()
    println("Sorted List: $sortedNumbers")


    //Part 6: Finding Maximum & Minimum Values
    val floatingPointNumbers = listOf(2.5, 7.1, 3.8, 9.2, 5.6)
    var largestNumber = floatingPointNumbers.maxOrNull()
    var smallestNumber = floatingPointNumbers.minOrNull()
    println("Largest number: $largestNumber")
    println("Smallest number: $smallestNumber")





}