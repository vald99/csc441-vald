package week3fri

fun main() {

    for (i in 1..10) {
        print("$i ")
    }
    println()

    for (i in 20 downTo 1 step 3) {
        print("$i ")
    }
    println()

    val tripSupplies = mutableListOf("Toothpaste", "Water", "Pillow", "Blanket")

    for (item in tripSupplies) {
        print("$item ")
    }
    println()

    println("----Trip Supplies----")
    tripSupplies.forEachIndexed { i, item ->
        println("${i+1}: $item")
    }

    for (i in 0 until tripSupplies.size) {
        println("$i: ${tripSupplies[i]}")
    }

    val day = 1
    when (day) {
        1 -> println("Day is Sunday!")
        2 -> println("Day is Monday!")
        3 -> println("Day is Tuesday!")
        4 -> println("Day is Wednesday!")
        5 -> println("Day is Thursday!")
        6 -> println("Day is Friday!")
        7 -> println("Day is Saturday!")
        else -> println("Day does not exist!")
    }

    val year = 2026
    val doomedStatus = if (year <= 2021) "ChatGPT not invented, not yet doomed!" else "ChatGPT invented! Run away!"
    println(doomedStatus)
}