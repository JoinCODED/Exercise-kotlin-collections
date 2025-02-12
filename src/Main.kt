fun main() {

    //part 1
    val fruitList =  mutableListOf("Apple", "Mango" , "Orange")
    fruitList.add("Tomato") //Tomato is a fruit :)
    println(fruitList)
    fruitList.removeAt(1)
    println(fruitList)

    //part 2
    val numSet = mutableSetOf(1,2,3,3,4,5,5)
    println(numSet)
    numSet.addAll(listOf(3,6))
    println(numSet)

    //part 3
    val geoMap = mutableMapOf("USA" to "Washington" , "France" to "Paris" , "Germany" to "Berlin")
    println(geoMap)
    geoMap.putAll(mapOf("Kuwait" to "Kuwait City" , "Oman" to "Muscat"))
    println(geoMap)
    println(geoMap.keys)
    println(geoMap.values)

    //part 4
    val carArray = arrayListOf("BMW","Toyota","Honda")
    println(carArray)
    carArray.addAll(arrayListOf("KIA","Ford"))
    println(carArray)
    carArray.removeFirst()
    println(carArray)

    //part 5
    val randList = listOf(10, 5, 20, 15, 25, 30)
    println(randList.filter{it >10})
    println(randList.sorted())

    //part 6
    val floatList = listOf(2.5, 7.1, 3.8, 9.2, 5.6)
    println("Largest number: ${floatList.maxOrNull()}")
    println("Smalled number: ${floatList.minOrNull()}")

}