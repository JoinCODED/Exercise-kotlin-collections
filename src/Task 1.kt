val fruits = mutableListOf("Apple", "Mango", "Kiwis")

fun main() {
    fruits.add("Orange")
    fruits.removeAt(2)
    println(fruits)
}