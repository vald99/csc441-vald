package week4wed

fun main() {
    println("---Step 1: take and return nothing---")
    describeToday()

    println("---Step 2: take nothing, return string---")
    println(favoriteThing())

    println("---Step 3: take number, return string")
    println(pickOne(number = 1))

    println("---Step 4: take number, return string, but SHORT!")
    println(pickOneShort(number = 2))

    println("---Step 5: take with default, return string")
    println(pickWithDefault())

    println("---Step 5.5: take with default first value, return string")
    println(pickWithDefault(name = "Joe"))
}

fun describeToday() {
    println("Time to go home and sleep!")
}

fun favoriteThing(): String {
    return "Sleeping at home"
}

fun pickOne(number: Int): String {
    return when (number) {
        1 -> "Apples"
        2 -> "Bananas"
        else -> "Nonsense!"
    }
}

fun pickOneShort(number: Int): String = when (number) {
    1 -> "Apples"
    2 -> "Bananas"
    else -> "Nonsense!"
}

fun pickWithDefault(number: Int = 5, name: String = "You"): String {
    val food = when (number) {
        1 -> "Apples"
        2 -> "Bananas"
        else -> "Nonsense!"
    }
    return "$name eats $food"
}