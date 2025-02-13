fun main() {
    val countries = mutableMapOf<String, String>("USA" to "Washington", "France" to "Paris", "Germany" to "Berlin")
    countries["Canada"]= "Ottawa"
countries.remove("Germany")
    println("Countries: ${countries.keys}")
    println("Capitals: ${countries.values}")

    println(countries)
}