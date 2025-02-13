fun main(){
    val arrayList = arrayListOf("BMW", "Toyota", "Ford")
    arrayList.add("Honda")
    arrayList.add("Audi")
    arrayList.removeAt(3)
    println(arrayList)
}