fun main() {

    val favouriteFruits = mutableListOf("Apple", "Mango", "Orange")
    favouriteFruits.add("Raspberries")
    favouriteFruits.removeAt(1)

    println(favouriteFruits)
//
    val numberSet = mutableSetOf(1, 2, 3, 3, 4, 5, 5)
    numberSet.add(3)
    numberSet.add(6)

    println(numberSet)
//
    val countryCapital = mutableMapOf("USA" to "Washington", "France" to "Paris", "Germany" to "Berlin")
    countryCapital["Canada"] = "Ottawa"

    println("Countries: ${countryCapital.keys}")
    println("Capitals: ${countryCapital.values}")

    countryCapital.remove("Germany")

    println("Final Map: $countryCapital")
//
    val carBrands = arrayListOf("BMW", "Toyota","Honda")
    carBrands.add("Porsche")
    carBrands.add("Ford")
    //carBrands.addAll(listOf(("Porsche", "Ford"))
    carBrands.remove("Porsche")

    println(carBrands)
//
    val numbersList = listOf(10, 5, 20, 15, 25, 30)
    val greaterThan15 = numbersList.filter { it > 15 }

    println("Numbers greater than 15: $greaterThan15")
    println("Sorted List: ${numbersList.sorted()}")
//
    val floatingList = listOf(2.5, 7.1, 3.8, 9.2, 5.6)

    println("Largest number: ${floatingList.maxOrNull()}")
    println("Smallest number: ${floatingList.minOrNull()}")
}