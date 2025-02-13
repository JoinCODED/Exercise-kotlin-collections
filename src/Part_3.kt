fun main(){

    val capital = mutableMapOf(
        "USA" to "Washington",
        "Japan" to "Tokyo",
        "Kuwait" to "Kuwait City",
        "Russia" to "Moscow"
        )

    capital.put("UAE", "Abu Dhabi")

    println("Countries: " + capital.keys)
    println("Capitals: " + capital.values)

    capital.remove("USA")

    println("Final Map: " + capital)
}