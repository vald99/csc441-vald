package week4fri

fun main() {
    println("---Requirement 1: Two names---")
    val valueString = "sleepy time!"
    val nullableString: String? = null
//    val nullableString: String? = "chicken noodle soup!"
    println(valueString)
    println(nullableString)

    println("---Requirement 2: A safe call---")
    println(nullableString?.length)

    println("---Requirement 3: The Elvis operator---")
    println(nullableString ?: "nothing!")

    println("---Requirement 4: A ?.let block---")
    nullableString?.let {
        println("Nullable string is now $it!")
    }

    println("---Requirement 5: toIntOrNull()---")
    val isNotNumber = "shoes".toIntOrNull()
    println(isNotNumber ?: "This is not a number!")

    println("---Requirement 6: A listOf---")
    val fourItemList = listOf("this", "is", "a", "list!")
    println(fourItemList)

    println("---Requirement 7: A mutableListOf---")
    val flexibleList = mutableListOf("flexible", "mutable", "alterable", "changeable")
    flexibleList.add("transformable")
    flexibleList.remove("changeable")

    println(flexibleList)
    println(flexibleList.size)

    println("---Requirement 8: A list of numbers---")
    val numberList = listOf(5, 10, 15, 20, 25, 30)
    println(numberList.sum())
    println(numberList.average())
    println(numberList.filter {it <= 20})


}