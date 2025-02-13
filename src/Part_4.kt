fun main(){
    val carBrand = arrayListOf("Toyota", "Honda", "Ford")
    carBrand.add("Subaru")
    carBrand.add("Tesla")
    carBrand.remove(carBrand.random()) //never specified which element to remove, so I tried something new
    println(carBrand)
}