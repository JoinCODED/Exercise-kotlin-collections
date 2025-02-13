val fruits = mutableListOf("Apple", "Banana", "Tomato")

fun main() {
    fruits.add("Peach")
    fruits.removeAt(1)
    println(fruits)
}