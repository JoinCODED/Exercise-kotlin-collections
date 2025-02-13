fun main() {
    // part 1
val fruits = mutableListOf("Rasberry","Strawberry","Pineapple")
fruits.add("Pomegranate")
   fruits.removeAt(1)
    println(fruits)


    // part 2
    val set = mutableSetOf(1,2,3,3,4,5,5)
    set.add(3)
    set.add(6)
    println(set)


    // part 3
    val countries = mutableMapOf("USA" to "Washington", "France" to "Paris", "Germany" to "Berlin")
    countries.put("Kuwait","Kuwait")

println("Countres ${countries.keys}")
    println("Capitals: ${countries.values}")

    countries.remove("France","Paris")
    println("Final map: ${countries}")


    // part 4
    val cars = arrayListOf("Jaguar", "Porsche", "Aston Martin")
    cars.add("Alfa Romio")
    cars.add("Maserati")
    cars.remove("Alfa Romio")
    println(cars)

    // part 5

    val numbers = listOf(10,5, 20, 15,25,30)
    println("numbers greater than 15: ${numbers.filter { it > 15 }}")
    println("Sorted list: ${numbers.sorted()}")

    // part 6
    val floatingNumbers = listOf(2.5,7.1,3.14,9.2, 11.1, 5.6)
    println("Largest number: ${floatingNumbers.maxOrNull()}")
    println("Smallest number: ${floatingNumbers.minOrNull()}")







}