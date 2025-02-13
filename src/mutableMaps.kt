val capitals = mutableMapOf("USA" to "Washington", "France" to "Paris", "Germany" to "Berlin")

fun main() {
    capitals["Kuwait"] = "Kuwait City"
    println("Countries: ${capitals.keys}")
    println("Capitals: ${capitals.values}")
    capitals.remove("USA")
    println("Final Map: $capitals")
}