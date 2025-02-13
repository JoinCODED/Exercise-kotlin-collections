fun main() {
    //println("Hello World!")

    //Part 1
    val favFruits = mutableListOf("Apple", "Mango","Orange")
    favFruits.add("Berries")
    favFruits.removeAt(3)
    println(favFruits)

    //Part 2
    val numbers = mutableSetOf(1, 2, 3, 3, 4, 5, 5);
    numbers.add(3)
    numbers.add(6)
    println(numbers)

    //Part 3
    val countryCapitals = mutableMapOf("USA" to "Washington", "France" to "Paris", "Germany" to "Berlin")
    countryCapitals["Canada"] = "Ottawa"
    println("Countries: ${countryCapitals.keys}")
    println("Capitals: ${countryCapitals.values}")
    countryCapitals.remove("Germany")
    println("Final Map: $countryCapitals")

    //Part 4
    val carBrands = arrayListOf("BMW", "Toyota", "Honda");
    carBrands.add("Ford")
    carBrands.add("Mercedes")
    carBrands.remove("Mercedes")
    println(carBrands)

    //Part 5
    val numbersList = listOf(10, 5, 20, 15, 25, 30)
    println("Numbers greater than 15: ${numbersList.filter{it > 15}}")
    println("Numbers greater than 15: ${numbersList.sorted()}")

    //Part 6
    val numbersFloatingList = listOf(2.5, 7.1, 3.8, 9.2, 5.6);
    println("Largest number: ${numbersFloatingList.maxOrNull()}")
    println("Smallest number: ${numbersFloatingList.minOrNull()}")

}

