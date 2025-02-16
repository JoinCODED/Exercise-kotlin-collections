fun main() {
    val numbers = arrayListOf(2.5, 7.1, 3.8, 9.2, 5.6)



    val largestNumber = numbers.maxOrNull()
    val smallestNumber = numbers.minOrNull()

    println("Largest number: "+largestNumber + "\n" + "Smallest number: "+smallestNumber)

}