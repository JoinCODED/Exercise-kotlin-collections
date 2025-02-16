fun main() {
   val countries = mutableMapOf<String, String>(
        "USA" to "Washington", "France" to "Paris", "Germany" to "Berlin"
    )

    println("Countries:"+countries.keys +"\n"
            +"Capitals"+countries.values+"\n"
            +"Final Map:"+countries )
}