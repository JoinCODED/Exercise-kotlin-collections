fun main() {
    val favoriteFruits = mutableListOf("Apple", "Banana", "Mango")
    favoriteFruits.add("Orange")
    favoriteFruits.removeAt(1)
    println(favoriteFruits)
}