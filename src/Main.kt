fun main() {
    var favoriteFruits = mutableListOf("Apple", "Mango", "Orange")

    println(favoriteFruits)

    var numbersSet = mutableSetOf(1, 2, 3, 3, 4, 4, 5)

    numbersSet.add(3)
    numbersSet.add(6)

    println(numbersSet)

    var countries = mutableMapOf("USA" to "Washington", "France" to "Paris", "Germany" to "Berlin")

//    countries.set("Kuwait", " Kuwait City")
    countries["Kuwait"] = " Kuwait City"
    println(countries)

    var cars = arrayListOf("BMW", "Toyota", "Honda", "Ford")
    cars.add("Mercedes")
    cars.add("Lambo")
//    cars.addAll(cars)

    println(cars)

    var numbers = listOf(16,10,5,20,15,25,30,18)

    println("greater than 15: ${numbers.filter { it > 15 }}")
    println("Sorted List: ${numbers.sorted()}")

    println(numbers.filter { it > 15 }.sorted())

    var numbersInDouble = listOf(2.5, 7.1, 3.8, 9.2, 5.6)
    println("Largest number: ${numbersInDouble.maxOrNull()}")
    println(numbersInDouble.minOrNull())

}
