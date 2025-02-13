fun main() {
    // part 1
    println("Part 1:");
    val fruits = mutableListOf("Green Apple", "Blueberry", "Banana");
    fruits.add("Strawberry");
    fruits.remove(fruits[1]);
    println("[*] " + fruits);

    // part 2
    println("\nPart 2:");
    val dupNums = mutableSetOf(1, 2, 3, 3, 4, 5, 5);
    dupNums.add(3);
    dupNums.add(6);
    println("[*] " + dupNums);

    // part 3
    println("\nPart 3:");
    val countries = mutableMapOf("USA" to "Washington", "France" to "Paris", "Germany" to "Berlin");
    countries["Kuwait"] = "Kuwait City";
    println("[*] Countries: ${countries.keys}");
    println("[*] Capitals: ${countries.values}");
    countries.remove("USA");
    println("[*] Final Map: $countries");

    // part 4
    println("\nPart 4:");
    val carBrands = mutableListOf("Toyota", "Hyundai", "BMW");
    carBrands.add("Kia");
    carBrands.add("Jetour");
    carBrands.remove("Kia");
    println("[*] " + carBrands);

    // part 5
    println("\nPart 5:");
    val numbers = listOf(10, 5, 20, 15, 25, 30);
    println("[*] Numbers greater than 15: ${numbers.filter {it > 15}}");
    println("[*] Sorted List: ${numbers.sorted()}");

    // part 6
    println("\nPart 6:");
    val floatList = listOf(2.5, 7.1, 3.8, 9.2, 5.6);
    println("[*] Largest number: ${floatList.maxOrNull()}");
    println("[*] Smalled number: ${floatList.minOrNull()}");

}