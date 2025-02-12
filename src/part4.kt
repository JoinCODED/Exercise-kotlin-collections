fun main() {
    var carBrands = arrayListOf("BMW", "Toyota", "Honda");

    carBrands.add("Ford")
    carBrands.add("GMC");
    carBrands.removeLast();

    println(carBrands);
}