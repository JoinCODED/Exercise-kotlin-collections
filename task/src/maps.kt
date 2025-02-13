fun main(){
    val mutableCountries = mutableMapOf("USA" to "Washington", "France" to "Paris","Germany" to "Berlin")
    mutableCountries["KSA"] = "Riyadh"
    println("Countries:" + mutableCountries.keys)
    println("Capitals: " + mutableCountries.values)
    mutableCountries.remove("France")
    println("Final Map: " + mutableCountries)
}