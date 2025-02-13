val countries = mutableMapOf("USA" to "Washington", "France" to "Paris", "Germany" to "Berlin")
fun main() {
    countries.put("Kuwait", "Kuwait City")

    println("Countries: ${countries.keys}")
    println("Capitals: ${countries.values}")
    countries.remove("France")
    println("Final Map: $countries")

}