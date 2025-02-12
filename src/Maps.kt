fun main(){

    val countriesAndCapitals = mutableMapOf(
        "USA" to "Washington"
        ,"France" to "Paris",
        "Germany" to "Berlin")

    countriesAndCapitals["Canada"] = "Ottawa"

    println("Countries: ${countriesAndCapitals.keys}")
    println("Capitals: ${countriesAndCapitals.values}")

    countriesAndCapitals.remove("USA")

    println("Final Map: $countriesAndCapitals")
}