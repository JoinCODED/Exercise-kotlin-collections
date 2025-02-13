fun main() {
    val countryCapitals = mutableMapOf(
        "USA" to "Washington",
        "France" to "Paris",
        "Germany" to "Berlin"
    )

    countryCapitals["Canada"] = "Ottawa"

    println("Countries: ${countryCapitals.keys}")
    println("Capitals: ${countryCapitals.values}")

    countryCapitals.remove("Germany")

    println("Final Map: $countryCapitals")
}